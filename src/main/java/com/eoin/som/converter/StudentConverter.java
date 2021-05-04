package com.eoin.som.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.eoin.som.dto.StudentDTO;
import com.eoin.som.entities.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
    public StudentDTO entityToDTO(Student student){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(student, StudentDTO.class);
    }

    public List<StudentDTO> entityToDTO(List<Student> students){
        return students.stream().map(x -> entityToDTO(x)).collect(Collectors.toList());
    }

    public Student dtoToEntity(StudentDTO dto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, Student.class);
    }

    public List<Student> dtoToEntity(List<StudentDTO> dto){
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
