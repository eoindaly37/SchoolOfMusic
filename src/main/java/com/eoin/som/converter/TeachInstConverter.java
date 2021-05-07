package com.eoin.som.converter;

import com.eoin.som.dto.TeachInstDTO;
import com.eoin.som.entities.TeachInstrument;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeachInstConverter {
    public TeachInstDTO entityToDTO(TeachInstrument teachInstrument){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(teachInstrument, TeachInstDTO.class);
    }

    public List<TeachInstDTO> entityToDTO(List<TeachInstrument> teachInstruments){
        return teachInstruments.stream().map(x -> entityToDTO(x)).collect(Collectors.toList());
    }

    public TeachInstrument dtoToEntity(TeachInstDTO dto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, TeachInstrument.class);
    }

    public List<TeachInstrument> dtoToEntity(List<TeachInstDTO> dto) {
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
