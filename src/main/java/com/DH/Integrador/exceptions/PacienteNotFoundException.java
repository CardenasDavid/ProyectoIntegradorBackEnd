package com.DH.Integrador.exceptions;

public class PacienteNotFoundException extends Exception{

    public PacienteNotFoundException() {
        super("Paciente no encontrado");
    }
}
