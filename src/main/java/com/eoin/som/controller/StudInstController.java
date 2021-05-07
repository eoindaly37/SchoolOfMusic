package com.eoin.som.controller;

import com.eoin.som.dto.StudInstDTO;
import com.eoin.som.service.StudInstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudInstController {
    @Autowired
    StudInstService studInstService;

    @GetMapping("/studinstrument")
    List<StudInstDTO> all() { return  studInstService.all();}

    @PostMapping("/studinstrument")
    StudInstDTO newStudInstrument(@RequestBody StudInstDTO dto){ return studInstService.save(dto);}

    @GetMapping("/studinstrument/{id}")
    StudInstDTO single(@PathVariable Long id){return studInstService.single(id);}

    @DeleteMapping("/studinstrument/{id}")
    Long deleteStudInst(@PathVariable Long id){return studInstService.deleteStudInstUsingId(id);}
}
