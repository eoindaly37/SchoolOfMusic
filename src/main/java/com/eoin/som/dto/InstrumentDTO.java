package com.eoin.som.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstrumentDTO {
    private Long id;
    private String name;
    public InstrumentDTO(String name){
        this.name = name;
    }
}
