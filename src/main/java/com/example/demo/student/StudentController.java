package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student" )
public class StudentController {
    @GetMapping
	public List<Student> getStudents(){
       return List.of(
            new Student(1L, "Lisandro" ,21 ,LocalDate.of(1998, Month.APRIL, 13),"lisandrotestadev@outlook.com" )
	   );
	}
}
