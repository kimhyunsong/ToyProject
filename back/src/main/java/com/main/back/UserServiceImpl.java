package com.main.back;
import com.main.back.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;


    @Autowired
    UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    @Override
    public List<UserDTO> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public String validationCheck(UserDTO user){
//        int res = UserMapper.signIn(user);
        if (user.getUser_id().equals("ssong")){
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
