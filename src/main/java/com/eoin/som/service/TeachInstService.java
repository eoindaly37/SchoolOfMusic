package com.eoin.som.service;

import com.eoin.som.dto.TeachInstDTO;
import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.TeachInstrument;
import com.eoin.som.entities.Teacher;

import java.util.List;

public interface TeachInstService {
    List<TeachInstDTO> all();
    TeachInstDTO single(Long id);
    TeachInstDTO save(TeachInstDTO teachInstDTO);
    Long deleteTeachInstUsingId(Long id);
}
