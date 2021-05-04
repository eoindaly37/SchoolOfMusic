package com.eoin.som.service;

import com.eoin.som.dao.StudInstRepository;
import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.StudInstrument;
import com.eoin.som.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudInstServiceImpl implements StudInstService{
    @Autowired
    StudInstRepository studInstRepository;

    @Override
    public List<StudInstrument> all() {
        return studInstRepository.findAll();
    }

    @Override
    public StudInstrument single(long id) {
        return studInstRepository.findById(id).orElse(null);
    }

    @Override
    public StudInstrument save(Student student, Instrument instrument, int grade) {
        StudInstrument studInstrument = new StudInstrument(student, instrument, grade);
        return studInstRepository.save(studInstrument);
    }

    @Override
    public long deleteStudInstUsingId(long id) {
        return studInstRepository.deleteStudInstrumentById(id);
    }
}
