package com.boot.system.service;

import com.boot.system.entity.CwwlUser;

import java.util.List;

/**
 * 人员信息Service接口
 *
 * @author logistics
 * @date 2019-09-04
 */
public interface ICwwlUserService {
    /**
     * 查询人员信息
     *
     * @param userId 人员信息ID
     * @return 人员信息
     */
    public CwwlUser selectCwwlUserById(Long userId);

    /**
     * 查询人员信息列表
     *
     * @param cwwlUser 人员信息
     * @return 人员信息集合
     */
    public List<CwwlUser> selectCwwlUserList(CwwlUser cwwlUser);

    /**
     * 新增人员信息
     *
     * @param cwwlUser 人员信息
     * @return 结果
     */
    public int insertCwwlUser(CwwlUser cwwlUser);

    /**
     * 修改人员信息
     *
     * @param cwwlUser 人员信息
     * @return 结果
     */
    public int updateCwwlUser(CwwlUser cwwlUser);

    /**
     * 批量删除人员信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwwlUserByIds(String ids);

    /**
     * 删除人员信息信息
     *
     * @param userId 人员信息ID
     * @return 结果
     */
    public int deleteCwwlUserById(Long userId);

    /**
     * 查询手机号是否重复
     * @param userPhone
     * @return
     */
    int checkUserPhone(String userPhone);
}
