package com.Management.School.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "parent_guardians")
@Data
public class ParentGuardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String relationship;

    @OneToMany(mappedBy = "parentGuardian", cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<>();
}