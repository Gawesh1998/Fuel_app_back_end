package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Sheduale;
import com.fuel.fuelapplication.repository.ShedualeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShedualeServiceImpl implements ShedualeService{

    private final ShedualeRepository shedualeRepository;

    public ShedualeServiceImpl(ShedualeRepository shedualeRepository) {
        this.shedualeRepository = shedualeRepository;
    }


    @Override
    public Sheduale save(Sheduale sheduale) {
        if (sheduale.getName().trim().equals(null) || sheduale.getName().trim().equals("")){
            throw new RuntimeException("Error: name is invalid");
        }
        return shedualeRepository.save(sheduale);
    }

    @Override
    public List<Sheduale> getAllSheduale() {
        return shedualeRepository.findAll();
    }
}
