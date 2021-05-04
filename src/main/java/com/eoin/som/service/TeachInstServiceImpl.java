package com.eoin.som.service;

import com.eoin.som.dao.TeachInstRepository;
import com.eoin.som.entities.Instrument;
import com.eoin.som.entities.TeachInstrument;
import com.eoin.som.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachInstServiceImpl implements TeachInstService{
    @Autowired
    TeachInstRepository teachInstRepository;

    @Override
    public List<TeachInstrument> all() {
        return teachInstRepository.findAll();
    }

    @Override
    public TeachInstrument single(long id) {
        return teachInstRepository.findById(id).orElse(null);
    }

    @Override
    public TeachInstrument save(Teacher teacher, Instrument instrument, int grade) {
        TeachInstrument teachInstrument = new TeachInstrument(teacher, instrument, grade);
        return teachInstRepository.save(teachInstrument);
    }

    @Override
    public long deleteTeachInstUsingId(long id) {
        return deleteTeachInstUsingId(id);
    }
}
