package com.main.back.dao.mapper;
import com.main.back.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<UserDTO> getUserList();

//    int signIn(UserDTO userDTO);
}
