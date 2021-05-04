package com.eoin.som.service;

import com.eoin.som.converter.TeacherConverter;
import com.eoin.som.dao.TeacherRepository;
import com.eoin.som.dto.TeacherDTO;
import com.eoin.som.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    TeacherConverter teacherConverter;

    @Override
    public List<TeacherDTO> all() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teacherConverter.entityToDTO(teachers);
    }

    @Override
    public TeacherDTO single(Long id) {
        Teacher teacher = teacherRepository.findById(id).orElse(null);
        return  teacherConverter.entityToDTO(teacher);
    }

    @Override
    public TeacherDTO save(TeacherDTO dto) {
        Teacher teacher = teacherConverter.dtoToEntity(dto);
        teacher = teacherRepository.save(teacher);
        return teacherConverter.entityToDTO(teacher);
    }

    @Override
    public Long deleteTeacherUsingId(Long id) {
        return teacherRepository.deleteTeacherById(id);
    }

}
