package com.DH.Integrador.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


@ToString
@Setter
@Getter
@Entity
@Table(name = "Turnos")
public class Turno {
    private int id;
    private Odontologo odontologo;
    private Paciente paciente;
    private LocalDateTime fecha;
}
