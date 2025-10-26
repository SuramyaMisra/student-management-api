package com.studentapp.student_api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.studentapp.student_api.model.Student;
import com.studentapp.student_api.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return repo.save(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
        return "Deleted Successfully!";
    }
}
