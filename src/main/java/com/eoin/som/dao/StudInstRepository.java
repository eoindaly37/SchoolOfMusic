package com.eoin.som.dao;

import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.StudInstrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudInstRepository extends JpaRepository<StudInstrument, Instrument> {
}
