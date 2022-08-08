package com.fuel.fuelapplication.controller;

import com.fuel.fuelapplication.model.Dispatch;
import com.fuel.fuelapplication.service.DispatchService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dispatch")
@AllArgsConstructor
public class DispatchController {

    private final DispatchService dispatchService;

    @PostMapping("/add")
    public ResponseEntity<Dispatch> save(@RequestBody Dispatch dispatch){
        return new ResponseEntity<>(dispatchService.save(dispatch), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public List<Dispatch> getAllDispatch(){
        return dispatchService.getAllDispatch();
    }
}
