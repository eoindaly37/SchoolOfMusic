package com.eoin.som.controller;

import com.eoin.som.dto.TeachInstDTO;
import com.eoin.som.service.TeachInstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeachInstController {
    @Autowired
    TeachInstService teachInstService;

    @GetMapping("/teachinstrument")
    List<TeachInstDTO> all() { return  teachInstService.all();}

    @PostMapping("/teachinstrument")
    TeachInstDTO newTeachInstrument(@RequestBody TeachInstDTO dto){ return teachInstService.save(dto);}

    @GetMapping("/teachinstrument/{id}")
    TeachInstDTO single(@PathVariable Long id){return teachInstService.single(id);}

    @DeleteMapping("/tachinstrument/{id}")
    Long deleteTeachInst(@PathVariable Long id){return teachInstService.deleteTeachInstUsingId(id);}
}
