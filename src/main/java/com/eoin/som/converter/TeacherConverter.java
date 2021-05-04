package com.eoin.som.converter;

import com.eoin.som.dto.TeacherDTO;
import com.eoin.som.entities.Teacher;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeacherConverter {
    public TeacherDTO entityToDTO(Teacher teacher){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(teacher, TeacherDTO.class);
    }

    public List<TeacherDTO> entityToDTO(List<Teacher> teachers){
        return teachers.stream().map(x -> entityToDTO(x)).collect(Collectors.toList());
    }

    public Teacher dtoToEntity(TeacherDTO dto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, Teacher.class);
    }

    public List<Teacher> dtoToEntity(List<TeacherDTO> dto){
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
