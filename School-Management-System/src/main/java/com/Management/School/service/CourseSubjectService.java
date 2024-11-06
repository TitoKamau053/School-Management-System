package com.Management.School.service;

import com.Management.School.entity.CourseSubject;
import com.Management.School.repository.CourseSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseSubjectService {
    private final CourseSubjectRepository courseSubjectRepository;
    
    @Autowired
    public CourseSubjectService(CourseSubjectRepository courseSubjectRepository) {
        this.courseSubjectRepository = courseSubjectRepository;
    }
    
    public List<CourseSubject> findAllCourseSubjects() {
        return courseSubjectRepository.findAll();
    }
    
    public Optional<CourseSubject> findCourseSubjectById(Long id) {
        return courseSubjectRepository.findById(id);
    }
    
    public CourseSubject saveCourseSubject(CourseSubject courseSubject) {
        return courseSubjectRepository.save(courseSubject);
    }
    
    public void deleteCourseSubject(Long id) {
        courseSubjectRepository.deleteById(id);
    }
}