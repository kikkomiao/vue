package com.example.vue.DAO;

import com.example.vue.entity.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    Login selectByAccount(String idcard,String password);
    int selectExist(String idcard);
    int selectPassword(String idcard,String password);
    int updateInfo(String idcard,String name,String phone,String email,int gender);
    int updatePassword(String idcard,String password);
    int insertInfo(String idcard,String password,String name,String phone,String email,int gender);
}
