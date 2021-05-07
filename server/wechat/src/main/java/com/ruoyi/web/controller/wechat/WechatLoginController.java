package com.ruoyi.web.controller.wechat;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.service.ISysUserService;
import com.ruoyi.wechat.service.WechatService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@RequestMapping("/wechat")
public class WechatLoginController {

    @Resource
    private WechatService wechatService;

    @Resource
    private ISysUserService userService;

    @PostMapping("/login")
    public AjaxResult login(@RequestBody HashMap<String, String> map) {
        return AjaxResult.success("", wechatService.init(map.get("code")));
    }

    @PreAuthorize("@ss.hasRole('wechat')")
    @PostMapping("/updateUserInfo")
    public AjaxResult updateUserInfo(@RequestBody HashMap<String, String> map) {
        Long userId = SecurityUtils.getLoginUser().getUser().getUserId();

        SysUser user = new SysUser();
        user.setUserId(userId);
        user.setNickName(map.get("nickName"));
        user.setSex(map.get("gender"));
        user.setCountry(map.get("country"));
        user.setProvince(map.get("province"));
        user.setCity(map.get("city"));
        user.setAvatar( map.get("avatarUrl"));

        userService.updateUserProfile(user);
        return AjaxResult.success();
    }

}