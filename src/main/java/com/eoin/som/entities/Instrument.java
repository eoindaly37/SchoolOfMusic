package com.eoin.som.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "instrument")
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "instrument", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<StudInstrument> students = new ArrayList<>();

    @OneToMany(mappedBy = "instrument", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<TeachInstrument> teachers = new ArrayList<>();

    public Instrument(String name){
        this.name = name;
    }
 }
