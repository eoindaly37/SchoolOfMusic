package com.eoin.som;

import com.eoin.som.dao.StudInstRepository;
import com.eoin.som.entities.*;
import com.eoin.som.service.InstrumentService;
import com.eoin.som.service.StudentService;
import com.eoin.som.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolOfMusicApplication implements CommandLineRunner {

    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    InstrumentService instrumentService;

    public static void main(String[] args) {SpringApplication.run(SchoolOfMusicApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {
        Instrument accordian = instrumentService.save("Accordion");
        Teacher padraig = teacherService.save("Padraig Buckley");
        Student eoin  = studentService.save("Eoin Daly");


        StudInstrument eoinsacc = new StudInstrument(eoin,accordian,7);
        TeachInstrument padraigsacc = new TeachInstrument(padraig, accordian,12);


    }
}
