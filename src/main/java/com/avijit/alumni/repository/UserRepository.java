package com.avijit.alumni.repository;

import com.avijit.alumni.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:২৮ PM
 * @project NstuAlumni
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByUsername(String userName);

    User findFirstById(Long id);

    List<User> findAllByBatchId(Long batchId);

}
