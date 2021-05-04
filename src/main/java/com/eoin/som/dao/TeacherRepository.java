package com.eoin.som.dao;

import com.eoin.som.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Transactional
    Long deleteTeacherById(Long id);
}
