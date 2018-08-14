package com.alp.JWTSecurity.controller;

import com.alp.JWTSecurity.model.JwtUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping
    public JwtUser hello() {
        JwtUser alp = new JwtUser("alp",12,"Computer Enginner");
        return alp;
    }
}
