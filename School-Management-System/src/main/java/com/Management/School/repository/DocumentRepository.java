package com.Management.School.repository;

import com.Management.School.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

	List<Document> findByStudentId(Long studentId);
}