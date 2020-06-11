package com.avijit.alumni.service;

import com.avijit.alumni.entity.Batch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৫৩ PM
 * @project NstuAlumni
 */
@Service
public interface BatchService {

    Batch readById(Long id);

    List<Batch> readAll();

    Batch create(Batch batch);
}
