package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> studentlist = new ArrayList<>();

    // Dummy Constructor data
    public StudentController() {
        studentlist.add(new Student(1, "Rahul", "rk@gmail.com"));
        studentlist.add(new Student(2, "Anushka", "anukri@gmail.com"));
    }

    //  Get all Students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentlist;
    }

    //  Get a single student by ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentlist.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Add new student (POST)
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        studentlist.add(student);
        return student;
    }

    //  Update student (PUT)
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        for (Student student : studentlist) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setEmail(updatedStudent.getEmail());
                return student;
            }
        }
        return null;
    }

    // Delete student (DELETE)
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean removed = studentlist.removeIf(student -> student.getId() == id);
        if (removed) {
            return "Student with ID " + id + " deleted.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }
}
