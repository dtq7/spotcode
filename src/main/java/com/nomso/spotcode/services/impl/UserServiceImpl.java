package com.nomso.spotcode.services.impl;

import com.nomso.spotcode.entities.User;
import com.nomso.spotcode.model.UserDto;
import com.nomso.spotcode.repositories.UserRepository;
import com.nomso.spotcode.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ajao temitayo
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(UserDto userDto) {
        if(userDto == null){
            throw new RuntimeException();
        }
        User user = new User();

        BeanUtils.copyProperties(userDto, user);
        logger.info(user.toString());
        userRepository.save(user);

    }

}
