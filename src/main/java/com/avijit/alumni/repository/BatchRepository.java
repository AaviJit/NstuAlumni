package com.avijit.alumni.repository;

import com.avijit.alumni.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৩৯ PM
 * @project NstuAlumni
 */
public interface BatchRepository extends JpaRepository<Batch, Long> {
    Batch findFirstById(Long id);
}
