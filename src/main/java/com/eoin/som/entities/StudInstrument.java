package com.eoin.som.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudInstrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn
    private Student student;

    @ManyToOne
    @JoinColumn
    private Instrument instrument;

    private int grade;

    public StudInstrument(Student student, Instrument instrument, int grade){
        this.student = student;
        this.instrument = instrument;
        this.grade = grade;
    }
}
