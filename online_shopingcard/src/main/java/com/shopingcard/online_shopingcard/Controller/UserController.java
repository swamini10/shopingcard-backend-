package com.shopingcard.online_shopingcard.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @GetMapping("v1/path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    

}
