package com.DH.Integrador;

import com.DH.Integrador.exceptions.OdontologoNotFoundException;
import com.DH.Integrador.exceptions.PacienteNotFoundException;
import com.DH.Integrador.repository.OdontologoRepository;
import com.DH.Integrador.repository.PacienteRepository;
import com.DH.Integrador.service.OdontologoService;
import com.DH.Integrador.service.PacienteService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class IntegradorApplicationTests {

    @Test
    @DisplayName("If Odontologo does not exits, Throws OdontologoNotFoundException")
    void test(){
        //GIVEN
        var repository= mock(OdontologoRepository.class);
        when(repository.findBymatricula(anyString())).thenReturn(Optional.empty());
        var service=new OdontologoService(repository);

        //WHEN and THEN
        assertThrows(OdontologoNotFoundException.class,()->service.findBymatricula("1234mat"));
    }
    @Test
    @DisplayName("If Paciente does not exits, Throws PacienteNotFoundException")
    void test2(){
        //GIVEN
        var repository= mock(PacienteRepository.class);
        when(repository.findById(anyInt())).thenReturn(Optional.empty());
        var service=new PacienteService(repository);

        //WHEN and THEN
        assertThrows(PacienteNotFoundException.class,()->service.eliminar(2727));
    }

}
