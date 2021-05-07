package com.eoin.som.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class StudInstDTO {
    private Long id;
    private StudentDTO student;
    private InstrumentDTO instrument;
    private int grade;
    public StudInstDTO(StudentDTO student, InstrumentDTO instrument, int grade){
        this.student = student;
        this.instrument = instrument;
        this.grade = grade;
    }
}
