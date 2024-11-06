package com.Management.School.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "course_subjects")
@Data
public class CourseSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subjectName;
    private String description;
    private String subjectCode;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class class1;

    
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}