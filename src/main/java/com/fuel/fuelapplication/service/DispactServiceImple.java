package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Dispatch;
import com.fuel.fuelapplication.repository.DispatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class DispactServiceImple implements DispatchService{

    private final DispatchRepository dispatchRepository;

    public DispactServiceImple(DispatchRepository dispatchRepository) {
        this.dispatchRepository = dispatchRepository;
    }

    @Override
    public Dispatch save(Dispatch dispatch) {
        if (dispatch.getName().trim().equals(null) || dispatch.getName().trim().equals(null)){
            throw new RuntimeException("Error: dispatch name is invalid");
        }
        return dispatchRepository.save(dispatch);

    }

    @Override
    public List<Dispatch> getAllDispatch() {
        return dispatchRepository.findAll();
    }
}
