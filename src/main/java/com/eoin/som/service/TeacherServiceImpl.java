package com.eoin.som.service;

import com.eoin.som.dao.TeacherRepository;
import com.eoin.som.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    TeacherRepository teacherRepository;


    @Override
    public List<Teacher> all() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher single(int id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher save(String name) {
        Teacher teacher = new Teacher(name);
        return teacherRepository.save(teacher);
    }

    @Override
    public int deleteTeacherUsingId(int id) {
        return teacherRepository.deleteTeacherById(id);
    }
}
