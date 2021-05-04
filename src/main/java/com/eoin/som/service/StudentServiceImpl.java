package com.eoin.som.service;

import com.eoin.som.converter.StudentConverter;
import com.eoin.som.dao.StudentRepository;
import com.eoin.som.dto.StudentDTO;
import com.eoin.som.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentConverter studentConverter;


    @Override
    public List<StudentDTO> all() {
        List<Student> students = studentRepository.findAll();
        return studentConverter.entityToDTO(students);
    }

    @Override
    public StudentDTO single(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        return  studentConverter.entityToDTO(student);
    }

    @Override
    public StudentDTO save(StudentDTO dto) {
        Student student = studentConverter.dtoToEntity(dto);
        student = studentRepository.save(student);
        return studentConverter.entityToDTO(student);
    }

    @Override
    public Long deleteStudentUsingId(Long id) {
        return studentRepository.deleteStudentById(id);
    }
}
