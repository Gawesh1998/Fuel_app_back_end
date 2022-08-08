package com.fuel.fuelapplication.controller;

import com.fuel.fuelapplication.model.Sheduale;
import com.fuel.fuelapplication.service.ShedualeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/sheduale")
@AllArgsConstructor
public class ShedualeController {

    private final ShedualeService shedualeService;

    @PostMapping("/add")
    public ResponseEntity<Sheduale> save(@RequestBody Sheduale sheduale){
        return new ResponseEntity<>(shedualeService.save(sheduale), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public List<Sheduale> getAll(){
        return shedualeService.getAllSheduale();
    }



}
