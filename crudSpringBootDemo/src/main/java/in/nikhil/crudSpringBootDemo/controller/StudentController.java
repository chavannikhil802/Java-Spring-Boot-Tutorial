package in.nikhil.crudSpringBootDemo.controller;

import in.nikhil.crudSpringBootDemo.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {

    }
}
