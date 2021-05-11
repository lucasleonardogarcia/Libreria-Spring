

package com.spring.libreria.service;

import com.spring.libreria.entity.Cliente;
import com.spring.libreria.entity.Prestamo;
import com.spring.libreria.repository.PrestamosRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PrestamosService {
    @Autowired
    private PrestamosRepository prestamoRepository;
    
    @Transactional
    public void crearPrestamo(Date fecha,Cliente cliente){
       Prestamo prestamo = new Prestamo();
       prestamo.setFecha(fecha);
       prestamo.setCliente(cliente);
       prestamoRepository.save(prestamo);
       
    }
    @Transactional(readOnly = true)
    public List<Prestamo> buscarTodos(){
       return prestamoRepository.findAll();
    }

}
