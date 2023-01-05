package com.main.back;

import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public class UserDTO  implements Serializable {

    private String user_id;
    private String password;

    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String isadmin;

    private String name;

    private String gender;

    private String email;


    public String getUser_id() {
        return user_id;
    }
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }



    public void setUser_id(String identification) {
        this.user_id = identification;
    }
}
