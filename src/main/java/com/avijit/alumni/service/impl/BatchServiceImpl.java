package com.avijit.alumni.service.impl;

import com.avijit.alumni.entity.Batch;
import com.avijit.alumni.repository.BatchRepository;
import com.avijit.alumni.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৫৪ PM
 * @project NstuAlumni
 */
@Service
public class BatchServiceImpl implements BatchService {

    private final BatchRepository batchRepository;

    @Autowired
    public BatchServiceImpl(BatchRepository batchRepository) {
        this.batchRepository = batchRepository;
    }

    @Override
    public Batch readById(Long id) {
        return batchRepository.findFirstById(id);
    }

    @Override
    public List<Batch> readAll() {
        return batchRepository.findAll();
    }

    @Override
    public Batch create(Batch batch) {
        return batchRepository.save(batch);
    }
}
