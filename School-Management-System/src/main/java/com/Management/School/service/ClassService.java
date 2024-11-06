package com.Management.School.service;

import com.Management.School.entity.Class;
import com.Management.School.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    private final ClassRepository classRepository;
    
    @Autowired
    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }
    
    public List<Class> findAllClasses() {
        return classRepository.findAll();
    }
    
    public Optional<Class> findClassById(Long id) {
        return classRepository.findById(id);
    }
    
    public Class saveClass(Class classEntity) {
        return classRepository.save(classEntity);
    }
    
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}