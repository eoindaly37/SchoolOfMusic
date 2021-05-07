package com.eoin.som.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TeachInstDTO {
    private Long id;
    private TeacherDTO teacher;
    private InstrumentDTO instrument;
    private int grade;
    public TeachInstDTO(TeacherDTO teacher, InstrumentDTO instrument, int grade){
        this.teacher = teacher;
        this.instrument = instrument;
        this.grade = grade;
    }
}
