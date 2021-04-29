package com.example.SpringApplication.Contoller;

import com.example.SpringApplication.Entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

@GetMapping
    public List<Student> getAllStudents(){
    return null;
}

@PostMapping
    public Student postStudent(@RequestBody Student student){
    return null;
    }

@DeleteMapping
public Student DeleteStudent(@RequestBody Student student)
{
	return null;
}


}
