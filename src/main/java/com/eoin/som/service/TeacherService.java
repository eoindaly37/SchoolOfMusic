package com.eoin.som.service;

import com.eoin.som.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    List<TeacherDTO> all();
    TeacherDTO single(Long id);
    TeacherDTO save(TeacherDTO dto);
    Long deleteTeacherUsingId(Long id);
}