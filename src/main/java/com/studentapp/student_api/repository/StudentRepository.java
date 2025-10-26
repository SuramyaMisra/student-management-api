package com.studentapp.student_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.studentapp.student_api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
