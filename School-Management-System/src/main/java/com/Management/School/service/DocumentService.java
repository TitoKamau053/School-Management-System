package com.Management.School.service;

import com.Management.School.entity.Document;
import com.Management.School.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;
    
    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }
    
    public List<Document> findAllDocuments() {
        return documentRepository.findAll();
    }
    
    public Optional<Document> findDocumentById(Long id) {
        return documentRepository.findById(id);
    }
    
    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }
    
    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }

    public List<Document> findDocumentsByStudentId(Long studentId) {
        return documentRepository.findByStudentId(studentId);
    }
}