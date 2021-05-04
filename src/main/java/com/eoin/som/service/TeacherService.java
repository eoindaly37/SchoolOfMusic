package com.eoin.som.service;

import com.eoin.som.entities.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> all();
    Teacher single(Long id);
    Teacher save(String name);
    Long deleteTeacherUsingId(Long id);
}
