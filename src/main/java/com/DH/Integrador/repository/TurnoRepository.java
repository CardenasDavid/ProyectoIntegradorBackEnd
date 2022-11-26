package com.DH.Integrador.repository;

import com.DH.Integrador.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TurnoRepository extends JpaRepository<Turno,Integer> {

}
