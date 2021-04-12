package com.eoin.som.service;

import com.eoin.som.entities.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> all();
    Teacher single(int id);
    Teacher save(String name);
    int deleteTeacherUsingId(int id);
}
