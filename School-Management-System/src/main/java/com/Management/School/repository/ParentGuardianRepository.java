package com.Management.School.repository;

import com.Management.School.entity.ParentGuardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentGuardianRepository extends JpaRepository<ParentGuardian, Long> {
}