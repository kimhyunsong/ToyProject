package com.main.back;


import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String validationCheck(){
        return "아직 아무고토 못하죠?";
    }
}
