package com.main.back;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired(required = false)
    private UserService userService;
    UserDTO userDTO = new UserDTO();

    @PostMapping("/signIn")
    @ResponseBody
    public String signIn(@RequestBody UserDTO user) throws Exception {
        String checkMessage = userService.validationCheck(user);
        userDTO.setUser_id(checkMessage);
        userDTO.setPassword("asdadsadd");
        return checkMessage;

    }

    @GetMapping("/test")
    @ResponseBody
    public List<UserDTO> test() throws Exception {

        List<UserDTO> test = userService.getUserList();
        return test;
    }



}
