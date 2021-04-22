package com.sunwoda.demo.service;

import com.sunwoda.demo.entity.UserAddressInfo;

import java.util.List;

/**
 * (UserAddressInfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-22 16:09:25
 */
public interface UserAddressInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAddressInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAddressInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userAddressInfo 实例对象
     * @return 实例对象
     */
    UserAddressInfo insert(UserAddressInfo userAddressInfo);

    /**
     * 修改数据
     *
     * @param userAddressInfo 实例对象
     * @return 实例对象
     */
    int update(UserAddressInfo userAddressInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
