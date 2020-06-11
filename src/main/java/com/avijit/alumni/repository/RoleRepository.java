package com.avijit.alumni.repository;

import com.avijit.alumni.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:২৯ PM
 * @project NstuAlumni
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findFirstById(Long id);
}
