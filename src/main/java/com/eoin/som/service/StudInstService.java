package com.eoin.som.service;

import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.StudInstrument;
import com.eoin.som.entities.Student;

import java.util.List;

public interface StudInstService {
    List<StudInstrument> all();
    StudInstrument single(long id);
    StudInstrument save(Student student, Instrument instrument, int grade);
    long deleteStudInstUsingId(long id);
}
