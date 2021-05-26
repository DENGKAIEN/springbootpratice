package com.example.inject.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")
public class User {


    private String userName;

    private int age;

    private Date birthday;

    private List<String> hobbies;

    private Map<Integer,String> girlFriends;

    private Address address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGirlFriends() {
        return girlFriends;
    }

    public void setGirlFriends(Map<Integer, String> girlFriends) {
        this.girlFriends = girlFriends;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", girlFriends=" + girlFriends +
                ", address=" + address +
                '}';
    }
}
