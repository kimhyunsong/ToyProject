package com.main.back;


import java.util.List;

public interface UserService {

    List<UserDTO> getUserList();
    String validationCheck(UserDTO userDTO) throws Exception;

   String getPassword() throws Exception;

    void setPassword(String password)throws Exception;

    String getIdentification() throws Exception;

    void setIdentification(String identification) throws Exception;
}
