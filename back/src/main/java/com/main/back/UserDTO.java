package com.main.back;

import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public class UserDTO  implements Serializable {

    private String identification;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
