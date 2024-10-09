package com.test.demo.services;



import com.test.demo.entity.TrainingCenter;
import com.test.demo.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;






@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenter createTrainingCenter(TrainingCenter center) {
        // Set createdOn to the current time
        center.setCreatedOn(Instant.now());
        return repository.save(center);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
