package com.example.vue.entity;

public class Login {
    private String name;
    private String phone;
    private String idcard;
    private String password;
    private String email;
    private int gender;


    public Login(String name, String phone, String idcard, String password, String email, int gender) {
        this.name = name;
        this.phone = phone;
        this.idcard = idcard;
        this.password = password;
        this.email = email;
        this.gender = gender;
    }

    public Login() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Login{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
