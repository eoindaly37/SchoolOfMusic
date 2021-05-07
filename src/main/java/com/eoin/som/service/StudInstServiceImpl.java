package com.eoin.som.service;

import com.eoin.som.converter.StudInstConverter;
import com.eoin.som.dao.InstrumentRepository;
import com.eoin.som.dao.StudInstRepository;
import com.eoin.som.dao.StudentRepository;
import com.eoin.som.dto.InstrumentDTO;
import com.eoin.som.dto.StudInstDTO;
import com.eoin.som.dto.StudentDTO;
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
    @Autowired
    StudInstConverter studInstConverter;
    @Autowired
    InstrumentService instrumentService;
    @Autowired
    StudentService studentService;

    @Override
    public List<StudInstDTO> all() {
        List<StudInstrument> studInstruments = studInstRepository.findAll();
        return  studInstConverter.entityToDTO(studInstruments);
    }

    @Override
    public StudInstDTO single(Long id) {
        StudInstrument studInstrument = studInstRepository.findById(id).orElse(null);
        return studInstConverter.entityToDTO(studInstrument);
    }

    @Override
    public StudInstDTO save(StudInstDTO studInstDTO) {
        StudentDTO studentDTO = studentService.single((studInstDTO.getStudent().getId()));
        InstrumentDTO instrumentDTO = instrumentService.single(studInstDTO.getInstrument().getId());
        StudInstDTO newStudInstDTO = new StudInstDTO(studentDTO, instrumentDTO, studInstDTO.getGrade());
        StudInstrument studInstrument = studInstConverter.dtoToEntity(newStudInstDTO);
        studInstrument = studInstRepository.save(studInstrument);
        return studInstConverter.entityToDTO(studInstrument);
    }

    @Override
    public Long deleteStudInstUsingId(Long id) {
        return studInstRepository.deleteStudInstrumentById(id);
    }
}
