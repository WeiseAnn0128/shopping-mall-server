package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysHelpInformation;

/**
 * 帮助信息表的增删查改Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-26
 */
public interface SysHelpInformationMapper 
{
    /**
     * 查询帮助信息表的增删查改
     * 
     * @param helpInformationId 帮助信息表的增删查改ID
     * @return 帮助信息表的增删查改
     */
    public SysHelpInformation selectSysHelpInformationById(Long helpInformationId);

    /**
     * 查询帮助信息表的增删查改列表
     * 
     * @param sysHelpInformation 帮助信息表的增删查改
     * @return 帮助信息表的增删查改集合
     */
    public List<SysHelpInformation> selectSysHelpInformationList(SysHelpInformation sysHelpInformation);

    /**
     * 新增帮助信息表的增删查改
     * 
     * @param sysHelpInformation 帮助信息表的增删查改
     * @return 结果
     */
    public int insertSysHelpInformation(SysHelpInformation sysHelpInformation);

    /**
     * 修改帮助信息表的增删查改
     * 
     * @param sysHelpInformation 帮助信息表的增删查改
     * @return 结果
     */
    public int updateSysHelpInformation(SysHelpInformation sysHelpInformation);

    /**
     * 删除帮助信息表的增删查改
     * 
     * @param helpInformationId 帮助信息表的增删查改ID
     * @return 结果
     */
    public int deleteSysHelpInformationById(Long helpInformationId);

    /**
     * 批量删除帮助信息表的增删查改
     * 
     * @param helpInformationIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysHelpInformationByIds(Long[] helpInformationIds);
}