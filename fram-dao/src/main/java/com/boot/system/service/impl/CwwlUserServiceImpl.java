package com.boot.system.service.impl;

import com.boot.common.core.text.Convert;
import com.boot.common.utils.DateUtils;
import com.boot.system.dao.CwwlUserMapper;
import com.boot.system.entity.CwwlUser;
import com.boot.system.service.ICwwlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 人员信息Service业务层处理
 *
 * @author logistics
 * @date 2019-09-04
 */
@Service
public class CwwlUserServiceImpl implements ICwwlUserService {

    @Autowired
    private CwwlUserMapper cwwlUserMapper;

    /**
     * 查询人员信息
     *
     * @param userId 人员信息ID
     * @return 人员信息
     */
    @Override
    public CwwlUser selectCwwlUserById(Long userId) {
        return cwwlUserMapper.selectCwwlUserById(userId);
    }

    /**
     * 查询人员信息列表
     *
     * @param cwwlUser 人员信息
     * @return 人员信息
     */
    @Override
    public List<CwwlUser> selectCwwlUserList(CwwlUser cwwlUser) {
        return cwwlUserMapper.selectCwwlUserList(cwwlUser);
    }

    /**
     * 新增人员信息
     *
     * @param cwwlUser 人员信息
     * @return 结果
     */
    @Override
    public int insertCwwlUser(CwwlUser cwwlUser) {
        cwwlUser.setCreateTime(DateUtils.getNowDate());
        return cwwlUserMapper.insertCwwlUser(cwwlUser);
    }

    /**
     * 修改人员信息
     *
     * @param cwwlUser 人员信息
     * @return 结果
     */
    @Override
    public int updateCwwlUser(CwwlUser cwwlUser) {
        cwwlUser.setUpdateTime(DateUtils.getNowDate());
        return cwwlUserMapper.updateCwwlUser(cwwlUser);
    }

    /**
     * 删除人员信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCwwlUserByIds(String ids) {
        return cwwlUserMapper.deleteCwwlUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除人员信息信息
     *
     * @param userId 人员信息ID
     * @return 结果
     */
    @Override
    public int deleteCwwlUserById(Long userId) {
        return cwwlUserMapper.deleteCwwlUserById(userId);
    }

    /**
     * 查询手机号是否重复
     * @param userPhone
     * @return
     */
    @Override
    public int checkUserPhone(String userPhone) {
        return cwwlUserMapper.checkUserPhone(userPhone);
    }
}
