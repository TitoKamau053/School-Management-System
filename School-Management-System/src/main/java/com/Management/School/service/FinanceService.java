package com.Management.School.service;

import com.Management.School.entity.Finance;
import com.Management.School.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FinanceService {
    private final FinanceRepository financeRepository;
    
    @Autowired
    public FinanceService(FinanceRepository financeRepository) {
        this.financeRepository = financeRepository;
    }
    
    public List<Finance> findAllFinances() {
        return financeRepository.findAll();
    }
    
    public Optional<Finance> findFinanceById(Long id) {
        return financeRepository.findById(id);
    }
    
    public Finance saveFinance(Finance finance) {
        return financeRepository.save(finance);
    }
    
    public void deleteFinance(Long id) {
        financeRepository.deleteById(id);
    }

    public List<Finance> findFinancesByStudentId(Long studentId) {
        return financeRepository.findByStudentId(studentId);
    }
}