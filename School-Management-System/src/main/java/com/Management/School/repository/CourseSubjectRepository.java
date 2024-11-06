package com.Management.School.repository;

import com.Management.School.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseSubjectRepository extends JpaRepository<CourseSubject, Long> {
}