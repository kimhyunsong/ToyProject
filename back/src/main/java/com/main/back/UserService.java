package com.main.back;





public interface UserService {
    String validationCheck(UserDTO userDTO) throws Exception;

   String getPassword() throws Exception;

    void setPassword(String password)throws Exception;

    String getIdentification() throws Exception;

    void setIdentification(String identification) throws Exception;
}
