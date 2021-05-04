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
    public Teacher single(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher save(String name) {
        Teacher teacher = new Teacher(name);
        return teacherRepository.save(teacher);
    }

    @Override
    public Long deleteTeacherUsingId(Long id) {
        return teacherRepository.deleteTeacherById(id);
    }
}
