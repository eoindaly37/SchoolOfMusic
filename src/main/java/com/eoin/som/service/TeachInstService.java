package com.eoin.som.service;

import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.TeachInstrument;
import com.eoin.som.entities.Teacher;

import java.util.List;

public interface TeachInstService {
    List<TeachInstrument> all();
    TeachInstrument single(long id);
    TeachInstrument save(Teacher teacher, Instrument instrument, int grade);
    long deleteTeachInstUsingId(long id);
}
