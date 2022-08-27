package com.example.vue.controller;

import com.example.vue.DAO.UsersMapper;
import com.example.vue.entity.User;
import com.example.vue.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UsersController {

    @Autowired
    private UsersService userService;
//    @Autowired
//    private UsersMapper userMapper;

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Integer delete(Integer userId) {
        System.out.println(userId);
        int result = userService.delete(userId);
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(User user) {
        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping(value = "/data",method = RequestMethod.GET)
    public int[] data(){
        int data[] = new int[4];
        data[0] = userService.selectone();
        data[1] = userService.selecttwo();
        data[2] = userService.selectthree();
        data[3] = userService.selectfour();
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+"!");
        }
        return data;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userService.insertUser(user);
    }

    @RestController
    @CrossOrigin
    @RequestMapping("/user")
    public class UserController {
        @Autowired
        private UsersMapper userMapper;
        @GetMapping("/page")
        public Map<String,Object> findpage(@RequestParam Integer pageNum,
                                           @RequestParam Integer pageSize,
                                           //要搜索多少个字段就写多少个
                                           @RequestParam String userName) {
            List<User> data;
            pageNum = (pageNum - 1) * pageSize;
            data = userMapper.selectPage(pageNum,pageSize,userName);
            Integer total = userMapper.selectTotall(userName);
            Map<String, Object> res = new HashMap<>();
            res.put("data",data);
            res.put("total",total);
            return res;
        }
    }


}

