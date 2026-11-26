package in.nikhil.crudSpringBootDemo.controller;

import in.nikhil.crudSpringBootDemo.entity.Student;
import in.nikhil.crudSpringBootDemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return createdStudent;
    }
}
