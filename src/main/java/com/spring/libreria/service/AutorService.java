

package com.spring.libreria.service;

import com.spring.libreria.entity.Autor;
import com.spring.libreria.repository.AutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;
    
    @Transactional
    public void crear(String nombre, List libro){
       Autor autor = new Autor();
       autor.setNombre(nombre);
       autor.setLibro(libro);
       autorRepository.save(autor);
       
    }
    @Transactional(readOnly = true)
    public List<Autor> buscarTodos(){
       return autorRepository.findAll();
    }
}
