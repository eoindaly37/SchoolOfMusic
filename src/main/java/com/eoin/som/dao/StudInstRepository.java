package com.eoin.som.dao;

import com.eoin.som.entities.StudInstrument;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface StudInstRepository extends JpaRepository<StudInstrument, Long> {
    @Transactional
    Long deleteStudInstrumentById(Long id);
}
