package com.eoin.som.dao;

import com.eoin.som.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Transactional
    int deleteStudentById(int id);
}
