package com.eoin.som.service;

import com.eoin.som.dao.InstrumentRepository;
import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentServiceImpl implements InstrumentService{
    @Autowired
    InstrumentRepository instrumentRepository;

    @Override
    public List<Instrument> all() {
        return instrumentRepository.findAll();
    }

    @Override
    public Instrument single(Long id) {
        return instrumentRepository.findById(id).orElse(null);
    }

    @Override
    public Instrument save(String name) {
        Instrument instrument = new Instrument(name);
        return instrumentRepository.save(instrument);
    }

    @Override
    public Long deleteInstrumentUsingId(Long id) {
        return instrumentRepository.deleteInstrumentById(id);
    }
}
