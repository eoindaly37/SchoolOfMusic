package com.eoin.som.service;

import com.eoin.som.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> all();
    Student single(long id);
    Student save(String name);
    long deleteStudentUsingId(long id);
}
