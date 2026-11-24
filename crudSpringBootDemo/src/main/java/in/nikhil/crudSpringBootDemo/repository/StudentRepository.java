package in.nikhil.crudSpringBootDemo.repository;

import in.nikhil.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq) {
        System.out.println("Inside Student Repository");
        System.out.println("Exiting Student Repository");

        Student s1 = new Student();
        s1.setName("Nikhil");
        s1.setEmail("chavannikhil802@gmail.com");
        s1.setAge(34);
        s1.setRollNo(1);
        s1.setSubject("Spring MVC Framework");

        return s1;
    }
}
