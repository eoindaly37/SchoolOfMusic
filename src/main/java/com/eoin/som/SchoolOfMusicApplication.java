package com.eoin.som;

import com.eoin.som.dao.StudInstRepository;
import com.eoin.som.dto.*;
import com.eoin.som.entities.*;
import com.eoin.som.service.*;
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

    @Autowired
    StudInstService studInstService;

    @Autowired
    TeachInstService teachInstService;

    public static void main(String[] args) {SpringApplication.run(SchoolOfMusicApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {
        InstrumentDTO accordiandto = new InstrumentDTO("Accordian");
        TeacherDTO padraigdto = new TeacherDTO("Padraig Buckley");
        StudentDTO eoindto  = new StudentDTO("Eoin Daly");

        StudentDTO eoin  = studentService.save(eoindto);
        TeacherDTO padraig = teacherService.save(padraigdto);
        InstrumentDTO accordion = instrumentService.save(accordiandto);


        StudInstDTO eoinsaccdto = new StudInstDTO(eoin, accordion, 6);
        StudInstDTO eoinsacc = studInstService.save(eoinsaccdto);

        TeachInstDTO padraigsaccdto = new TeachInstDTO(padraig, accordion, 20);
        TeachInstDTO padraigsacc = teachInstService.save(padraigsaccdto);

    }
}
