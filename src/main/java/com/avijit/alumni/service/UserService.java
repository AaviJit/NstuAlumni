package com.avijit.alumni.service;

import com.avijit.alumni.common.exception.UserNotFoundException;
import com.avijit.alumni.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৪৬ PM
 * @project NstuAlumni
 */

@Service
public interface UserService {

    User readByUsername(String username) throws UserNotFoundException;
}
