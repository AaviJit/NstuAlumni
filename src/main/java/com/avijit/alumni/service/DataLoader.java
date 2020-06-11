package com.avijit.alumni.service;

import com.avijit.alumni.entity.Role;
import com.avijit.alumni.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৩০ PM
 * @project NstuAlumni
 */
@Service
public class DataLoader implements ApplicationRunner {

    private RoleRepository roleRepository;

    @Autowired
    public DataLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        if (roleRepository.findFirstById(1L) == null)
            roleRepository.save(new Role(1, "ROLE_SUPER_ADMIN"));
        else if (!roleRepository.findFirstById(1L).getName().equals("ROLE_SUPER_ADMIN")) {
            Role oldAdminDate = roleRepository.findFirstById(1L);
            Role role = new Role();
            role.setId(oldAdminDate.getId());
            role.setName("ROLE_SUPER_ADMIN");
            roleRepository.save(role);
        }

        if (roleRepository.findFirstById(2L) == null)
            roleRepository.save(new Role(2, "ROLE_USER"));
        else if (!roleRepository.findFirstById(2L).getName().equals("ROLE_USER")) {
            Role oldAdminDate = roleRepository.findFirstById(2L);
            Role role = new Role();
            role.setId(oldAdminDate.getId());
            role.setName("ROLE_USER");
            roleRepository.save(role);
        }
    }

}
