package com.fuel.fuelapplication.repository;

import com.fuel.fuelapplication.model.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispatchRepository extends JpaRepository<Dispatch, Long> {
}
