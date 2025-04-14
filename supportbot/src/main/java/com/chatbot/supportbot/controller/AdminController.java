package com.chatbot.supportbot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.supportbot.model.User;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping()
public class AdminController {

    private List<User> list = new ArrayList<>();
 
    @GetMapping("/")
    public Map<String, String> home(HttpServletRequest httpServletRequest){
        CsrfToken token = (CsrfToken) httpServletRequest.getAttribute("_csrf");
        Map<String, String> map = new HashMap<>();
        map.put("message", "Welcome to home page");
        map.put("sessionid", httpServletRequest.getSession().getId());
        map.put("csrfToken", token.getToken());
        
        return map;
    }


    @GetMapping("/getallusers")
    public List getAllUsers(){
        return list;
    }

    @PostMapping("/register")
    public String postMethodName(@RequestBody User user) {
        
       list.add(user);
        
        return "Registered Successfully";
    }
    
}
