package com.eoin.som.service;

import com.eoin.som.dto.InstrumentDTO;
import com.eoin.som.dto.StudInstDTO;
import com.eoin.som.dto.StudentDTO;

import java.util.List;

public interface StudInstService {
    List<StudInstDTO> all();
    StudInstDTO single(Long id);
    StudInstDTO save(StudInstDTO studInstDTO);
    Long deleteStudInstUsingId(Long id);
}
