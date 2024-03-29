package com.nomso.spotcode.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author ajao temitayo
 */
public class UserDto {

    @NotBlank
    private String userName;

    @NotBlank
    @Email
    private String email;

    private String password;
    private int age;

    public UserDto() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



