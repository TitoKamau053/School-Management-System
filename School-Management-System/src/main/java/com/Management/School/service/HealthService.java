package com.Management.School.service;

import com.Management.School.entity.Health;
import com.Management.School.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HealthService {
    private final HealthRepository healthRepository;
    
    @Autowired
    public HealthService(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }
    
    public List<Health> findAllHealthRecords() {
        return healthRepository.findAll();
    }
    
    public Optional<Health> findHealthRecordById(Long id) {
        return healthRepository.findById(id);
    }
    
    public Health saveHealthRecord(Health health) {
        return healthRepository.save(health);
    }
    
    public void deleteHealthRecord(Long id) {
        healthRepository.deleteById(id);
    }

    public List<Health> findHealthRecordsByStudentId(Long studentId) {
        return healthRepository.findByStudentId(studentId);
    }
}