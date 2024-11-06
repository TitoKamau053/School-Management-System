package com.Management.School;

import com.Management.School.entity.Student;
import com.Management.School.entity.ParentGuardian;
import com.Management.School.service.StudentService;
import com.Management.School.service.ParentGuardianService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EntityRelationshipTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ParentGuardianService parentGuardianService;

    @Test
    @Transactional
    public void testStudentParentGuardianRelationship() {
        // Create a ParentGuardian instance
        ParentGuardian parent = new ParentGuardian();
        parent.setFirstName("John");
        parent.setLastName("Doe");
        parent.setEmail("john.doe@example.com");
        parent.setPhoneNumber("123456789");
        parent.setAddress("123 Main St");
        parent.setRelationship("Father");

        // Save the ParentGuardian instance
        ParentGuardian savedParent = parentGuardianService.saveParentGuardian(parent);

        // Create a Student instance and associate it with the ParentGuardian
        Student student = new Student();
        student.setFirstName("Jane");
        student.setLastName("Doe");
        student.setEmail("jane.doe@example.com");
        student.setPhoneNumber("987654321");
        student.setAddress("123 Main St");
        student.setParentGuardian(savedParent); // Set the relationship

        // Save the Student instance
        Student savedStudent = studentService.saveStudent(student);

        // Assertions to verify the relationship
        assertNotNull(savedStudent.getId(), "Student ID should not be null after saving.");
        assertNotNull(savedStudent.getParentGuardian(), "ParentGuardian should not be null.");
        assertEquals(savedParent.getId(), savedStudent.getParentGuardian().getId(), "The ParentGuardian ID should match.");
    }
}