package com.avijit.alumni.service.impl;

import com.avijit.alumni.common.exception.EntityNotFoundException;
import com.avijit.alumni.common.exception.UserNotFoundException;
import com.avijit.alumni.dto.UserDTO;
import com.avijit.alumni.entity.User;
import com.avijit.alumni.mapper.UserMapper;
import com.avijit.alumni.repository.UserRepository;
import com.avijit.alumni.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৪৯ PM
 * @project NstuAlumni
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User readByUsername(String username) throws UserNotFoundException {
        System.out.println("From username in impl:" + username);
        return userRepository.findFirstByUsername(username);
    }

    @Override
    public User createUser(UserDTO dto) throws Exception {
        User user = userMapper.requestMapper(dto);
        return userRepository.save(user);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findFirstById(id);
        if (user == null)
            throw new EntityNotFoundException("user ot found with id");
        return userMapper.responseMapper(user);
    }

    @Override
    public List<UserDTO> getUserByBatchId(Long batchId) {
        List<User> users = userRepository.findAllByBatchId(batchId);
        return users.stream().map(userMapper::responseMapper).collect(Collectors.toList());
    }
}
