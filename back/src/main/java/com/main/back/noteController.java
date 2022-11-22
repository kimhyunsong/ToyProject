package com.main.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class noteController {


    @GetMapping("/searchTest")
    public String test123(){
        System.out.println("check");
        return "searchTest.html";
    }

}
