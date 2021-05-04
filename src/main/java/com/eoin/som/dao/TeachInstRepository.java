package com.eoin.som.dao;

import com.eoin.som.entities.TeachInstrument;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface TeachInstRepository extends JpaRepository<TeachInstrument,Long> {
    @Transactional
    Long deleteTeachInstrumentById(Long id);
}
