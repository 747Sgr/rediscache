package com.sunwoda.demo.controller;

import com.sunwoda.demo.entity.User;
import com.sunwoda.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-04-22 10:24:33
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        return this.userService.queryById(id);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOneTwo")
    public User selectOneTwo(Long id) {
        return this.userService.selectOneTwo(id);
    }

    @PostMapping("/getList")
    public List<User> getList(@RequestBody User req){
        return userService.getList(req);
    }

    @PutMapping("/update")
    public String update(@RequestBody User req){
        int update = userService.update(req);
        if (update > 0){
            return "成功";
        }else {
            return "失败";
        }
    }



}
