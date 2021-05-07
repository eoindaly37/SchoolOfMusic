package com.eoin.som.service;

import com.eoin.som.converter.TeachInstConverter;
import com.eoin.som.dao.TeachInstRepository;
import com.eoin.som.dto.InstrumentDTO;
import com.eoin.som.dto.TeachInstDTO;
import com.eoin.som.dto.TeacherDTO;
import com.eoin.som.entities.TeachInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachInstServiceImpl implements TeachInstService{
    @Autowired
    TeachInstRepository teachInstRepository;
    @Autowired
    TeachInstConverter teachInstConverter;
    @Autowired
    InstrumentService instrumentService;
    @Autowired
    TeacherService teacherService;

    @Override
    public List<TeachInstDTO> all() {
        List<TeachInstrument> TeachInstruments = teachInstRepository.findAll();
        return  teachInstConverter.entityToDTO(TeachInstruments);
    }

    @Override
    public TeachInstDTO single(Long id) {
        TeachInstrument TeachInstrument = teachInstRepository.findById(id).orElse(null);
        return teachInstConverter.entityToDTO(TeachInstrument);
    }

    @Override
    public TeachInstDTO save(TeachInstDTO TeachInstDTO) {
        TeacherDTO TeacherDTO = teacherService.single((TeachInstDTO.getTeacher().getId()));
        InstrumentDTO instrumentDTO = instrumentService.single(TeachInstDTO.getInstrument().getId());
        TeachInstDTO newTeachInstDTO = new TeachInstDTO(TeacherDTO, instrumentDTO, TeachInstDTO.getGrade());
        TeachInstrument TeachInstrument = teachInstConverter.dtoToEntity(newTeachInstDTO);
        TeachInstrument = teachInstRepository.save(TeachInstrument);
        return teachInstConverter.entityToDTO(TeachInstrument);
    }

    @Override
    public Long deleteTeachInstUsingId(Long id) {
        return teachInstRepository.deleteTeachInstrumentById(id);
    }
}
