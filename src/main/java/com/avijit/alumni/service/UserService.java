package com.avijit.alumni.service;

import com.avijit.alumni.common.exception.UserNotFoundException;
import com.avijit.alumni.dto.UserDTO;
import com.avijit.alumni.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৪৬ PM
 * @project NstuAlumni
 */

@Service
public interface UserService {

    User readByUsername(String username) throws UserNotFoundException;

    User createUser(UserDTO dto) throws Exception;

    UserDTO getUserById(Long id);

    List<UserDTO> getUserByBatchId(Long batchId);
}
