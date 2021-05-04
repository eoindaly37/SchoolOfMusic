package com.eoin.som.service;

import com.eoin.som.converter.InstrumentConverter;
import com.eoin.som.dao.InstrumentRepository;
import com.eoin.som.dto.InstrumentDTO;
import com.eoin.som.entities.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentServiceImpl implements InstrumentService{
    @Autowired
    InstrumentRepository instrumentRepository;

    @Autowired
    InstrumentConverter instrumentConverter;


    @Override
    public List<InstrumentDTO> all() {
        List<Instrument> instruments = instrumentRepository.findAll();
        return instrumentConverter.entityToDTO(instruments);
    }

    @Override
    public InstrumentDTO single(Long id) {
        Instrument instrument = instrumentRepository.findById(id).orElse(null);
        return instrumentConverter.entityToDTO(instrument);
    }

    @Override
    public InstrumentDTO save(InstrumentDTO dto) {
        Instrument instrument = instrumentConverter.dtoToEntity(dto);
        instrument = instrumentRepository.save(instrument);
        return instrumentConverter.entityToDTO(instrument);
    }

    @Override
    public Long deleteInstrumentUsingId(Long id) {
        return instrumentRepository.deleteInstrumentById(id);
    }
}
