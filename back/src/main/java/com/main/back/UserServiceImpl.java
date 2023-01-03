package com.main.back;


import com.main.back.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String validationCheck(UserDTO user){
        String res = UserMapper.signIn(user);
        if (user.getIdentification().equals("ssong")){
            return "OK";
        } else {
            return "Fail";
        }
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
