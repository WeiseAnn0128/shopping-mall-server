package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysServicePhonenumMapper;
import com.ruoyi.system.domain.SysServicePhonenum;
import com.ruoyi.system.service.ISysServicePhonenumService;

/**
 * 客服电话Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-08
 */
@Service
public class SysServicePhonenumServiceImpl implements ISysServicePhonenumService 
{
    @Autowired
    private SysServicePhonenumMapper sysServicePhonenumMapper;

    /**
     * 查询客服电话
     * 
     * @param id 客服电话ID
     * @return 客服电话
     */
    @Override
    public SysServicePhonenum selectSysServicePhonenumById(Long id)
    {
        return sysServicePhonenumMapper.selectSysServicePhonenumById(id);
    }

    /**
     * 查询客服电话列表
     * 
     * @param sysServicePhonenum 客服电话
     * @return 客服电话
     */
    @Override
    public List<SysServicePhonenum> selectSysServicePhonenumList(SysServicePhonenum sysServicePhonenum)
    {
        return sysServicePhonenumMapper.selectSysServicePhonenumList(sysServicePhonenum);
    }

    /**
     * 新增客服电话
     * 
     * @param sysServicePhonenum 客服电话
     * @return 结果
     */
    @Override
    public int insertSysServicePhonenum(SysServicePhonenum sysServicePhonenum)
    {
        return sysServicePhonenumMapper.insertSysServicePhonenum(sysServicePhonenum);
    }

    /**
     * 修改客服电话
     * 
     * @param sysServicePhonenum 客服电话
     * @return 结果
     */
    @Override
    public int updateSysServicePhonenum(SysServicePhonenum sysServicePhonenum)
    {
        return sysServicePhonenumMapper.updateSysServicePhonenum(sysServicePhonenum);
    }

    /**
     * 批量删除客服电话
     * 
     * @param ids 需要删除的客服电话ID
     * @return 结果
     */
    @Override
    public int deleteSysServicePhonenumByIds(Long[] ids)
    {
        return sysServicePhonenumMapper.deleteSysServicePhonenumByIds(ids);
    }

    /**
     * 删除客服电话信息
     * 
     * @param id 客服电话ID
     * @return 结果
     */
    @Override
    public int deleteSysServicePhonenumById(Long id)
    {
        return sysServicePhonenumMapper.deleteSysServicePhonenumById(id);
    }
}
