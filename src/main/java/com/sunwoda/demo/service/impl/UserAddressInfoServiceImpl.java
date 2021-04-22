package com.sunwoda.demo.service.impl;

import com.sunwoda.demo.entity.UserAddressInfo;
import com.sunwoda.demo.dao.UserAddressInfoDao;
import com.sunwoda.demo.service.UserAddressInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserAddressInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-22 16:09:25
 */
@Service("userAddressInfoService")
public class UserAddressInfoServiceImpl implements UserAddressInfoService {
    @Resource
    private UserAddressInfoDao userAddressInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAddressInfo queryById(Long id) {
        return this.userAddressInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserAddressInfo> queryAllByLimit(int offset, int limit) {
        return this.userAddressInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userAddressInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserAddressInfo insert(UserAddressInfo userAddressInfo) {
        this.userAddressInfoDao.insert(userAddressInfo);
        return userAddressInfo;
    }

    /**
     * 修改数据
     *
     * @param userAddressInfo 实例对象
     * @return 实例对象
     */
    @Override
    public int update(UserAddressInfo userAddressInfo) {
        return this.userAddressInfoDao.update(userAddressInfo);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userAddressInfoDao.deleteById(id) > 0;
    }
}
