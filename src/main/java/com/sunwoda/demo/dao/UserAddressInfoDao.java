package com.sunwoda.demo.dao;

import com.sunwoda.demo.entity.UserAddressInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserAddressInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-22 16:09:24
 */
public interface UserAddressInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAddressInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAddressInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userAddressInfo 实例对象
     * @return 对象列表
     */
    List<UserAddressInfo> queryAll(UserAddressInfo userAddressInfo);

    /**
     * 新增数据
     *
     * @param userAddressInfo 实例对象
     * @return 影响行数
     */
    int insert(UserAddressInfo userAddressInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAddressInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserAddressInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAddressInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<UserAddressInfo> entities);

    /**
     * 修改数据
     *
     * @param userAddressInfo 实例对象
     * @return 影响行数
     */
    int update(UserAddressInfo userAddressInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

