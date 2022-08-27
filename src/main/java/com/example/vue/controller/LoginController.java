package com.example.vue.controller;

import com.example.vue.entity.Login;
import com.example.vue.entity.User;
import com.example.vue.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/updateinfo", method = RequestMethod.GET)
//    @ResponseBody
    public int updateInfo(@RequestParam(value = "name")String name,@RequestParam(value = "phone")String phone, @RequestParam(value = "email")String email,@RequestParam(value = "gender")int gender,@RequestParam(value = "idcard")String idcard) {
        int result1 = -1;
        result1 = loginService.updateInfo(idcard,name,phone,email,gender);
        System.out.println(result1);
        return result1;
    }

    @RequestMapping(value = "/updatepwd", method = RequestMethod.GET)
//    @ResponseBody
    public int  updatePassword(@RequestParam(value = "idcard")String idcard,@RequestParam(value = "password")String password,@RequestParam(value = "oldpassword")String oldpassword) {
        int result2 = -1;
        int jud2 = -1;
        jud2 = loginService.selectpassword(idcard,oldpassword);
        if(jud2 == 1){
            result2 = loginService.updatePassword(idcard,password);
            System.out.println(result2);
            return result2;
//             jud1 res1 修改成功
        }else if(jud2 == 0){
//            jud0 res2 原密码错误
            result2 = 2;
            return result2;
        }else{
//            res -1 请求错误
            return result2;
        }

    }

    @RequestMapping(value = "/insertinfo", method = RequestMethod.GET)
//    @ResponseBody
    public int insertInfo(@RequestParam(value = "idcard")String idcard,@RequestParam(value = "password")String password ,@RequestParam(value = "name")String name, @RequestParam(value = "phone")String phone, @RequestParam(value = "email")String email,@RequestParam(value = "gender")Integer gender) {
//        gender = 0;
        int jud = -2;
        int res = -2;
        System.out.println("收到！1111111111");
        jud = loginService.selectExist(idcard);
        if(jud >0){
            res = -1;
            System.out.println(res);
            return res;
        }else{
            res = loginService.insertInfo(idcard,password, name, phone, email,gender);
            System.out.println(res);
            return res;
        }
    }

    @RequestMapping(value = "/selectinfo",method = RequestMethod.GET)
//    @ResponseBody
//    @RequestBody
    public Login selectByAccount(@RequestParam(value = "idcard")String idcard, @RequestParam(value = "password")String password) {
//        idcard = "370305200101070429";
//        password = "myf2001";
        System.out.println(idcard+"1");
        System.out.println(password+"2");
        Login dir = loginService.selectByAccount(idcard,password);
        System.out.println(dir);
        return dir;
    }


}
