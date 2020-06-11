package com.avijit.alumni.controller;

import com.avijit.alumni.common.exception.EntityNotFoundException;
import com.avijit.alumni.entity.Batch;
import com.avijit.alumni.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Avijit Barua
 * Created On 6/11/20 at 1:12 PM
 * Project: alumni
 */
@RestController
@RequestMapping(value = "/batch")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @PostMapping(value = "")
    public Batch saveBatch(@RequestBody Batch batch) {
        if (batch == null)
            throw new EntityNotFoundException("Null object received");
        return batchService.create(batch);
    }

    @GetMapping(value = "/all")
    public List<Batch> getAllBatch() {
        return batchService.readAll();
    }

    @GetMapping(value = "/{id}")
    public Batch getById(@PathVariable Long id) {
        if (id == null)
            throw new EntityNotFoundException("Null id received ");
        return batchService.readById(id);
    }
}
