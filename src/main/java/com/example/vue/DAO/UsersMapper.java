package com.example.vue.DAO;

import com.example.vue.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {
    List<User> selectPage(Integer pageNum, Integer pageSize,String userName);
    Integer selectTotall(String userName);

    public int insertUser(User user);

    public int delete(int userId);

    public int Update(User user);

    Integer selectone();
    Integer selecttwo();
    Integer selectthree();
    Integer selectfour();
}


