package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysServicePhonenum;

/**
 * 客服电话Service接口
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
public interface ISysServicePhonenumService 
{
    /**
     * 查询客服电话
     * 
     * @param id 客服电话ID
     * @return 客服电话
     */
    public SysServicePhonenum selectSysServicePhonenumById(Long id);

    /**
     * 查询客服电话列表
     * 
     * @param sysServicePhonenum 客服电话
     * @return 客服电话集合
     */
    public List<SysServicePhonenum> selectSysServicePhonenumList(SysServicePhonenum sysServicePhonenum);

    /**
     * 新增客服电话
     * 
     * @param sysServicePhonenum 客服电话
     * @return 结果
     */
    public int insertSysServicePhonenum(SysServicePhonenum sysServicePhonenum);

    /**
     * 修改客服电话
     * 
     * @param sysServicePhonenum 客服电话
     * @return 结果
     */
    public int updateSysServicePhonenum(SysServicePhonenum sysServicePhonenum);

    /**
     * 批量删除客服电话
     * 
     * @param ids 需要删除的客服电话ID
     * @return 结果
     */
    public int deleteSysServicePhonenumByIds(Long[] ids);

    /**
     * 删除客服电话信息
     * 
     * @param id 客服电话ID
     * @return 结果
     */
    public int deleteSysServicePhonenumById(Long id);
}
