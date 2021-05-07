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
public class TeachInstrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Teacher teacher;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Instrument instrument;

    private int grade;

    public TeachInstrument(Teacher teacher, Instrument instrument, int grade){
        this.teacher = teacher;
        this.instrument = instrument;
        this.grade = grade;
    }
}
