package com.avijit.alumni.service;

import com.avijit.alumni.entity.Role;

import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৫৮ PM
 * @project NstuAlumni
 */
public interface RoleService {


    Role readById(Long id);

    List<Role> readAll();
}
