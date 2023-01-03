package com.main.back.dao.mapper;
import com.main.back.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

public interface UserMapper {

    static String signIn(UserDTO user);
}
