package com.avijit.alumni.controller;

import com.avijit.alumni.common.exception.EntityNotFoundException;
import com.avijit.alumni.dto.UserDTO;
import com.avijit.alumni.entity.User;
import com.avijit.alumni.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Avijit Barua
 * Created On 6/11/20 at 1:26 PM
 * Project: alumni
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "")
    public User registration(@RequestBody UserDTO dto) throws Exception {
        if (dto == null)
            throw new EntityNotFoundException("Null dto received");
        return userService.createUser(dto);
    }

    @PutMapping(value = "/update")
    public User update(@RequestBody UserDTO dto) throws Exception {
        if (dto == null)
            throw new EntityNotFoundException("Null dto received");
        return userService.createUser(dto);
    }

    @GetMapping(value = "/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        if (id == null)
            throw new EntityNotFoundException("Id is null");
        return userService.getUserById(id);
    }
}
