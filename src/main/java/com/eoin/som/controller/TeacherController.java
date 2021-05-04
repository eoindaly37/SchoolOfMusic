package com.eoin.som.controller;

import com.eoin.som.dto.TeacherDTO;
import com.eoin.som.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacher")
    List<TeacherDTO> all() { return  teacherService.all();}

    @PostMapping("/teacher")
    TeacherDTO newTeacher(@RequestBody TeacherDTO dto){ return teacherService.save(dto);}

    @GetMapping("/teacher/{id}")
    TeacherDTO single(@PathVariable Long id){return teacherService.single(id);}

    @DeleteMapping("/teacher/{id}")
    Long deleteTeacher(@PathVariable Long id){return teacherService.deleteTeacherUsingId(id);}
}
