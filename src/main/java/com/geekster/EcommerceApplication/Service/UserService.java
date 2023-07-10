package com.geekster.EcommerceApplication.Service;

import com.geekster.EcommerceApplication.Model.User;
import com.geekster.EcommerceApplication.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public void addAllUser(Iterable<User> users) {
        userRepository.saveAll(users);
    }

    public List<User> getUserById(Iterable<Long> userId) {
        return userRepository.findAllById(userId);
    }
}
