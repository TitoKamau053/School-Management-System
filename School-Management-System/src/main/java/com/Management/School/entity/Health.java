package com.Management.School.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.time.LocalDateTime;
import java.util.HashSet;

@Entity
@Table(name = "health")
@Data
public class Health {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicalCondition;
    private String allergies;
    private String bloodGroup;
    private String emergencyContact;
    private String medications;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
