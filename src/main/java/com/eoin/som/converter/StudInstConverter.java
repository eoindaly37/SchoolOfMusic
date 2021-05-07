package com.eoin.som.converter;

import com.eoin.som.dto.StudInstDTO;
import com.eoin.som.entities.StudInstrument;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudInstConverter {
    public StudInstDTO entityToDTO(StudInstrument studInstrument){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(studInstrument, StudInstDTO.class);
    }

    public List<StudInstDTO> entityToDTO(List<StudInstrument> studInstruments){
        return studInstruments.stream().map(x -> entityToDTO(x)).collect(Collectors.toList());
    }

    public StudInstrument dtoToEntity(StudInstDTO dto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, StudInstrument.class);
    }

    public List<StudInstrument> dtoToEntity(List<StudInstDTO> dto){
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
