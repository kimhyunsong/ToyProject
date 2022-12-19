package com.main.back;


import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String validationCheck(){
        return "아직 아무고토 못하죠?";
    }

    @Override
    public String getPassword() throws Exception {
        return null;
    }

    @Override
    public void setPassword(String password) throws Exception {

    }

    @Override
    public String getIdentification() throws Exception {
        return null;
    }

    @Override
    public void setIdentification(String identification) throws Exception {

    }
}
