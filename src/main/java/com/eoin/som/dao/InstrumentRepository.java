package com.eoin.som.dao;

import com.eoin.som.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface InstrumentRepository extends JpaRepository<Instrument, Integer> {
    @Transactional
    int deleteInstrumentById(int id);
}
