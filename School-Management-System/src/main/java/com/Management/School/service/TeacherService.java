package com.Management.School.service;

import com.Management.School.entity.Teacher;
import com.Management.School.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    
    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }
    
    public Optional<Teacher> findTeacherById(Long id) {
        return teacherRepository.findById(id);
    }
    
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}