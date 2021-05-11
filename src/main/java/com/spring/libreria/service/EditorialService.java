

package com.spring.libreria.service;

import com.spring.libreria.entity.Editorial;
import com.spring.libreria.repository.EditorialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialService {
@Autowired
    private EditorialRepository editorialRepository;
    
    @Transactional
    public void crearEditorial(String nombre , List libro){
       Editorial editorial = new Editorial();
       editorial.setNombre(nombre);
       editorial.setLibro(libro);
       editorialRepository.save(editorial);
       
       
    }
    @Transactional(readOnly = true)
    public List<Editorial> buscarTodosEditorial(){
       return editorialRepository.findAll();
    }
}
