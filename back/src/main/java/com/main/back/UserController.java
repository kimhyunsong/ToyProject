package com.main.back;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


@Controller
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired(required = false)
    private UserService userService;


    @GetMapping("/signIn")
    @ResponseBody
    public String signIn() throws Exception {
        //사실 이거 바디로 받아서 포스트 매핑으로 해야하나 일단 테스트중
        String checkMessage = userService.validationCheck();
        System.out.println(checkMessage);
        return checkMessage;
    }

}
