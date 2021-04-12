package com.eoin.som.service;

import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.Student;

import java.util.List;

public interface InstrumentService {
    List<Instrument> all();
    Instrument single(int id);
    Instrument save(String name);
    int deleteInstrumentUsingId(int id);
}
