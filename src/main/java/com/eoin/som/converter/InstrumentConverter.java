package com.eoin.som.converter;

import com.eoin.som.dto.InstrumentDTO;
import com.eoin.som.entities.Instrument;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InstrumentConverter {
    public InstrumentDTO entityToDTO(Instrument instrument){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(instrument, InstrumentDTO.class);
    }

    public List<InstrumentDTO> entityToDTO(List<Instrument> instruments){
        return instruments.stream().map(x -> entityToDTO(x)).collect(Collectors.toList());
    }

    public Instrument dtoToEntity(InstrumentDTO dto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, Instrument.class);
    }

    public List<Instrument> dtoToEntity(List<InstrumentDTO> dto){
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
