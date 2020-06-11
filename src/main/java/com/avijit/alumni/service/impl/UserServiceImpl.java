package com.avijit.alumni.service.impl;

import com.avijit.alumni.common.exception.UserNotFoundException;
import com.avijit.alumni.entity.User;
import com.avijit.alumni.repository.UserRepository;
import com.avijit.alumni.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৪৯ PM
 * @project NstuAlumni
 */
@Service
public class UserServiceImpl  implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User readByUsername(String username) throws UserNotFoundException {
        System.out.println("From username in impl:" + username);
        return userRepository.findFirstByUsername(username);
    }
}
