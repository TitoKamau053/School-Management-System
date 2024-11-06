package com.Management.School.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "classes")
@Data
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;
    private String section;
    private Integer academicYear;

    @OneToMany(mappedBy = "studentClass")
    private Set<Student> students = new HashSet<>();

    @ManyToMany(mappedBy = "classes")
    private Set<Teacher> teachers = new HashSet<>();

    @OneToMany(mappedBy = "class")
    private Set<CourseSubject> courseSubjects = new HashSet<>();
}
