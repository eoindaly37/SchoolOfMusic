package com.eoin.som.service;

import com.eoin.som.dto.InstrumentDTO;

import java.util.List;

public interface InstrumentService {
    List<InstrumentDTO> all();
    InstrumentDTO single(Long id);
    InstrumentDTO save(InstrumentDTO dto);
    Long deleteInstrumentUsingId(Long id);
}
