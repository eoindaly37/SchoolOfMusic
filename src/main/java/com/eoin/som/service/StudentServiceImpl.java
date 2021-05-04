package com.eoin.som.service;

import com.eoin.som.dao.StudentRepository;
import com.eoin.som.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> all() {
        return studentRepository.findAll();
    }

    @Override
    public Student single(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student save(String name) {
        Student student = new Student(name);
        return studentRepository.save(student);
    }

    @Override
    public long deleteStudentUsingId(long id) {
        return studentRepository.deleteStudentById(id);
    }
}
