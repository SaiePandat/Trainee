package com.test.demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.entity.TrainingCenter;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
}
