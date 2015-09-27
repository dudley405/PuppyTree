package com.puppy.service;

import com.puppy.dao.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 9/24/2015.
 */
public interface UserService {

    User findUserByUserName(String userName);
}
