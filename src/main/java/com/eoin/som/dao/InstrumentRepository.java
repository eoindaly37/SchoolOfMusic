package com.eoin.som.dao;

import com.eoin.som.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument, Integer> {
}
