package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysHelpInformationMapper;
import com.ruoyi.system.domain.SysHelpInformation;
import com.ruoyi.system.service.ISysHelpInformationService;

/**
 * 帮助信息表的增删查改Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-26
 */
@Service
public class SysHelpInformationServiceImpl implements ISysHelpInformationService 
{
    @Autowired
    private SysHelpInformationMapper sysHelpInformationMapper;

    /**
     * 查询帮助信息表的增删查改
     * 
     * @param helpInformationId 帮助信息表的增删查改ID
     * @return 帮助信息表的增删查改
     */
    @Override
    public SysHelpInformation selectSysHelpInformationById(Long helpInformationId)
    {
        return sysHelpInformationMapper.selectSysHelpInformationById(helpInformationId);
    }

    /**
     * 查询帮助信息表的增删查改列表
     * 
     * @param sysHelpInformation 帮助信息表的增删查改
     * @return 帮助信息表的增删查改
     */
    @Override
    public List<SysHelpInformation> selectSysHelpInformationList(SysHelpInformation sysHelpInformation)
    {
        return sysHelpInformationMapper.selectSysHelpInformationList(sysHelpInformation);
    }

    /**
     * 新增帮助信息表的增删查改
     * 
     * @param sysHelpInformation 帮助信息表的增删查改
     * @return 结果
     */
    @Override
    public int insertSysHelpInformation(SysHelpInformation sysHelpInformation)
    {
        sysHelpInformation.setCreateTime(DateUtils.getNowDate());
        return sysHelpInformationMapper.insertSysHelpInformation(sysHelpInformation);
    }

    /**
     * 修改帮助信息表的增删查改
     * 
     * @param sysHelpInformation 帮助信息表的增删查改
     * @return 结果
     */
    @Override
    public int updateSysHelpInformation(SysHelpInformation sysHelpInformation)
    {
        return sysHelpInformationMapper.updateSysHelpInformation(sysHelpInformation);
    }

    /**
     * 批量删除帮助信息表的增删查改
     * 
     * @param helpInformationIds 需要删除的帮助信息表的增删查改ID
     * @return 结果
     */
    @Override
    public int deleteSysHelpInformationByIds(Long[] helpInformationIds)
    {
        return sysHelpInformationMapper.deleteSysHelpInformationByIds(helpInformationIds);
    }

    /**
     * 删除帮助信息表的增删查改信息
     * 
     * @param helpInformationId 帮助信息表的增删查改ID
     * @return 结果
     */
    @Override
    public int deleteSysHelpInformationById(Long helpInformationId)
    {
        return sysHelpInformationMapper.deleteSysHelpInformationById(helpInformationId);
    }
}
