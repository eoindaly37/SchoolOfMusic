package com.eoin.som.dao;

import com.eoin.som.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    @Transactional
    int deleteTeacherById(int id);
}
