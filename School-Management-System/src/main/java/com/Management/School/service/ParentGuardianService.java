package com.Management.School.service;

import com.Management.School.entity.ParentGuardian;
import com.Management.School.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ParentGuardianService {
    private final ParentGuardianRepository parentGuardianRepository;
    
    @Autowired
    public ParentGuardianService(ParentGuardianRepository parentGuardianRepository) {
        this.parentGuardianRepository = parentGuardianRepository;
    }
    
    public List<ParentGuardian> findAllParentGuardians() {
        return parentGuardianRepository.findAll();
    }
    
    public Optional<ParentGuardian> findParentGuardianById(Long id) {
        return parentGuardianRepository.findById(id);
    }
    
    public ParentGuardian saveParentGuardian(ParentGuardian parentGuardian) {
        return parentGuardianRepository.save(parentGuardian);
    }
    
    public void deleteParentGuardian(Long id) {
        parentGuardianRepository.deleteById(id);
    }

	public ParentGuardian save(ParentGuardian parent) {
		// TODO Auto-generated method stub
		return null;
	}
}
