package com.peacizen.peacizen.service;

import com.peacizen.peacizen.controller.dto.UserRegisterRequest;
import com.peacizen.peacizen.entity.User;
import com.peacizen.peacizen.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void register(UserRegisterRequest request){
        User user = new User(request);
        user.setStatus(User.Status.ACTIVE);
        userRepository.save(user);
    }
}
