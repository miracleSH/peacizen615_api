package com.peacizen.peacizen.controller;

import com.peacizen.peacizen.controller.dto.UserRegisterRequest;
import com.peacizen.peacizen.repository.UserRepository;
import com.peacizen.peacizen.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserRegisterRequest request){
        userService.register(request);
    }
}
