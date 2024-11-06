package com.Management.School.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.time.LocalDateTime;
import java.util.HashSet;

@Entity
@Table(name = "finances")
@Data
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String paymentType;
    private String status;
    private String description;
    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}

