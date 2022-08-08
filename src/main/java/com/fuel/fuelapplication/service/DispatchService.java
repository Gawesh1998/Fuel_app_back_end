package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Dispatch;

import java.util.List;

public interface DispatchService {

    Dispatch save(Dispatch dispatch);
    List<Dispatch> getAllDispatch();
}
