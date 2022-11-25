package com.DH.Integrador.repository;

import com.DH.Integrador.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;


@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo,Integer> {

    Odontologo findBymatricula(String mat);

}
