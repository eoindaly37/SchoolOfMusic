package com.eoin.som.service;

import com.eoin.som.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> all();
    Student single(int id);
    Student save(String name);
    int deleteStudentUsingId(int id);
}
