package com.DH.Integrador.repository;

import com.DH.Integrador.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
   Optional<Paciente> findBydni(String dni);
}
