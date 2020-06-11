package com.avijit.alumni.service.impl;

import com.avijit.alumni.entity.Role;
import com.avijit.alumni.repository.RoleRepository;
import com.avijit.alumni.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৫৯ PM
 * @project NstuAlumni
 */
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role readById(Long id) {
        return roleRepository.findFirstById(id);
    }

    @Override
    public List<Role> readAll() {
        return roleRepository.findAll();
    }
}
