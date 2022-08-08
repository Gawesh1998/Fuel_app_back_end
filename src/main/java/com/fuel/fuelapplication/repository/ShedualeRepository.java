package com.fuel.fuelapplication.repository;

import com.fuel.fuelapplication.model.Sheduale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShedualeRepository extends JpaRepository<Sheduale, Long> {
}
