package com.eoin.som.service;

import com.eoin.som.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> all();
    StudentDTO single(long id);
    StudentDTO save(StudentDTO dto);
    long deleteStudentUsingId(long id);
}
