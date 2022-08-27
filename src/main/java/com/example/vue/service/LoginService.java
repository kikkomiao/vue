package com.example.vue.service;

import com.example.vue.DAO.LoginMapper;
import com.example.vue.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;
    public Login selectByAccount(String idcard,String password) {
        return loginMapper.selectByAccount(idcard,password);
    }

    public int selectExist(String idcard) {
        return loginMapper.selectExist(idcard);
    }
    public int selectpassword(String idcard,String password) {
        return loginMapper.selectPassword(idcard,password);
    }

    public int updateInfo(String idcard, String name, String phone, String email,int gender) {
        return loginMapper.updateInfo(idcard, name, phone, email,gender);
    }

    public int updatePassword(String idcard, String password) {
        return loginMapper.updatePassword(idcard, password);
    }

    public int insertInfo(String idcard,String password ,String name, String phone, String email,int gender){
        return loginMapper.insertInfo(idcard,password, name, phone, email,gender);
    }
}
