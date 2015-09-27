package com.puppy.service.impl;

import com.puppy.dao.entity.User;
import com.puppy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 9/24/2015.
 */
@Service
public class UserServiceImpl implements UserService {

    public User findUserByUserName(String userName) {
        return new User();
    }
}
