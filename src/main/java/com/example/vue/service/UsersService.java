package com.example.vue.service;


import com.example.vue.DAO.UsersMapper;
import com.example.vue.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersMapper userMapper;

//    public List<User> findByName(String userName,Integer startRows) {
//        return userMapper.findUserByName(userName,startRows);
//    }
//
//    public List<User> queryPage(Integer startRows) {
//        return userMapper.queryPage(startRows);
//    }

//    public List<User> queryPage(Integer startRows,Integer pageSize) {
//        return userMapper.queryPage(startRows,pageSize);
//    }

//    public int getRowCount() {
//        return userMapper.getRowCount();
//    }

    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public int Update(User user){
        return userMapper.Update(user);
    }

    public int delete(int userId){
        return userMapper.delete(userId);
    }

    public int selectone(){
        return userMapper.selectone();
    }
    public int selecttwo(){
        return userMapper.selecttwo();
    }
    public int selectthree(){
        return userMapper.selectthree();
    }
    public int selectfour(){
        return userMapper.selectfour();
    }
}

