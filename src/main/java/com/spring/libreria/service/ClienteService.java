

package com.spring.libreria.service;

import com.spring.libreria.entity.Cliente;
import com.spring.libreria.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {
@Autowired
    private ClienteRepository clienteRepository;
    
    @Transactional
    public void crearCliente(Long documento,String nombre, String apellido, String domicilio, String telefono ){
       Cliente cliente = new Cliente();
       cliente.setDocumento(documento);
       cliente.setNombre(nombre);
       cliente.setApellido(apellido);
       cliente.setDomicilio(domicilio);
       cliente.setTelefono(telefono);
       clienteRepository.save(cliente);
       
       
    }
    @Transactional(readOnly = true)
    public List<Cliente> buscarTodosCliente(){
       return clienteRepository.findAll();
    }
}
