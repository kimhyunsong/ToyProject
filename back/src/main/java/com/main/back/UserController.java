package com.main.back;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


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
        userDTO.setIdentification(checkMessage);
        userDTO.setPassword("asdadsadd");
        return checkMessage;

    }



}
