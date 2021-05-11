package com.ruoyi.web.controller.system;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.UserMsg;
import com.ruoyi.system.service.IUserMsgService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消息列表Controller
 * 
 * @author ruoyi
 * @date 2021-05-10
 */
@RestController
@RequestMapping("/system/message")
public class UserMsgController extends BaseController
{
    @Autowired
    private IUserMsgService userMsgService;

    /**
     * 查询消息列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserMsg userMsg)
    {
        startPage();
        List<UserMsg> list = userMsgService.selectUserMsgList(userMsg);
        return getDataTable(list);
    }

    /**
     * 导出消息列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:export')")
    @Log(title = "消息列表", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UserMsg userMsg)
    {
        List<UserMsg> list = userMsgService.selectUserMsgList(userMsg);
        ExcelUtil<UserMsg> util = new ExcelUtil<UserMsg>(UserMsg.class);
        return util.exportExcel(list, "消息列表数据");
    }

    /**
     * 获取消息列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:message:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return AjaxResult.success(userMsgService.selectUserMsgById(userId));
    }

    /**
     * 新增消息列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:add')")
    @Log(title = "消息列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserMsg userMsg)
    {
        return toAjax(userMsgService.insertUserMsg(userMsg));
    }

    /**
     * 修改消息列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:edit')")
    @Log(title = "消息列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserMsg userMsg)
    {
        return toAjax(userMsgService.updateUserMsg(userMsg));
    }

    /**
     * 删除消息列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:remove')")
    @Log(title = "消息列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(userMsgService.deleteUserMsgByIds(userIds));
    }
}
