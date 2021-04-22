package com.sunwoda.demo.controller;

import com.sunwoda.demo.entity.UserAddressInfo;
import com.sunwoda.demo.service.UserAddressInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserAddressInfo)表控制层
 *
 * @author makejava
 * @since 2021-04-22 16:09:25
 */
@RestController
@RequestMapping("userAddressInfo")
public class UserAddressInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserAddressInfoService userAddressInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserAddressInfo selectOne(Long id) {
        return this.userAddressInfoService.queryById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody UserAddressInfo req){
        int update = userAddressInfoService.update(req);
        if (update > 0){
            return "成功";
        }else {
            return "失败";
        }
    }

}
