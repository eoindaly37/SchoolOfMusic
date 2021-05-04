package com.eoin.som.controller;

import com.eoin.som.dto.StudentDTO;
import com.eoin.som.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    List<StudentDTO> all() { return  studentService.all();}

    @PostMapping("/student")
    StudentDTO newStudent(@RequestBody StudentDTO dto){ return studentService.save(dto);}

    @GetMapping("/student/{id}")
    StudentDTO single(@PathVariable Long id){return studentService.single(id);}

    @DeleteMapping("/student/{id}")
    Long deleteStudent(@PathVariable Long id){return studentService.deleteStudentUsingId(id);}

}
