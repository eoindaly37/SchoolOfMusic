package com.eoin.som.controller;

import com.eoin.som.dto.InstrumentDTO;
import com.eoin.som.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstrumentController {
    @Autowired
    InstrumentService instrumentService;

    @GetMapping("/instrument")
    List<InstrumentDTO> all() { return  instrumentService.all();}

    @PostMapping("/instrument")
    InstrumentDTO newInstrument(@RequestBody InstrumentDTO dto){ return instrumentService.save(dto);}

    @GetMapping("/instrument/{id}")
    InstrumentDTO single(@PathVariable Long id){return instrumentService.single(id);}

    @DeleteMapping("/instrument/{id}")
    Long deleteInstrument(@PathVariable Long id){return instrumentService.deleteInstrumentUsingId(id);}
}
