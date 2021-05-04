package com.eoin.som.dao;

import com.eoin.som.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
    @Transactional
    Long deleteInstrumentById(Long id);
}
