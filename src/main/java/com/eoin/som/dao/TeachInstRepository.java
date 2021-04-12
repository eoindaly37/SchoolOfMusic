package com.eoin.som.dao;

import com.eoin.som.entities.TeachInstrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachInstRepository extends JpaRepository<TeachInstrument,Integer> {
}
