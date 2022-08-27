package com.example.vue.entity;

public class User {

    private int userId;
    private String userDate;
    private String userName;
    private String userAddress;
    private int numTime;
    private String userPhone;
    private String userPoli;
    private String userEmail;
    private String userGender;
    private String userNation;
    private String userEdu;
    private int numCount;
    private int userAge;

    public User() {
    }

//    public User(int userId, String userDate, String userName, String userAddress) {
//        this.userId = userId;
//        this.userDate = userDate;
//        this.userName = userName;
//        this.userAddress = userAddress;
//    }

    public User(int userId, String userDate, String userName, String userAddress, int numTime, String userPhone, String userPoli) {
        this.userId = userId;
        this.userDate = userDate;
        this.userName = userName;
        this.userAddress = userAddress;
        this.numTime = numTime;
        this.userPhone = userPhone;
        this.userPoli = userPoli;
    }

    public User(int userId, String userDate, String userName, String userAddress, int numTime, String userPhone, String userPoli, String userEmail, String userGender, String userNation, String userEdu, int numCount,int userAge) {
        this.userId = userId;
        this.userDate = userDate;
        this.userName = userName;
        this.userAddress = userAddress;
        this.numTime = numTime;
        this.userPhone = userPhone;
        this.userPoli = userPoli;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userNation = userNation;
        this.userEdu = userEdu;
        this.numCount = numCount;
        this.userAge = userAge;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }


    public int getNumTime() {
        return numTime;
    }

    public void setNumTime(int numTime) {
        this.numTime = numTime;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPoli() {
        return userPoli;
    }

    public void setUserPoli(String userPoli) {
        this.userPoli = userPoli;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    public String getUserEdu() {
        return userEdu;
    }

    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu;
    }

    public int getNumCount() {
        return numCount;
    }

    public void setNumCount(int numCount) {
        this.numCount = numCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userDate='" + userDate + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", numTime=" + numTime +
                ", userPhone='" + userPhone + '\'' +
                ", userPoli='" + userPoli + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userNation='" + userNation + '\'' +
                ", userEdu='" + userEdu + '\'' +
                ", numCount=" + numCount +
                ", userAge=" + userAge +
                '}';
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}

