

package com.spring.libreria.service;

import com.spring.libreria.entity.Autor;
import com.spring.libreria.entity.Editorial;
import com.spring.libreria.entity.Libro;
import com.spring.libreria.repository.LibroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroService {
@Autowired
    private LibroRepository libroRepository;
    
    @Transactional
    public void crearLibro(String titulo, Integer anio, Integer ejemplares,
            Integer prestados,Autor autor, Editorial editorial ){
       Libro libro = new Libro();
       libro.setTitulo(titulo);
       libro.setAnio(anio);
       libro.setEjemplares(ejemplares);
       libro.setPrestados(prestados);
       libro.setAutor(autor);
       libro.setEditorial(editorial);
       libroRepository.save(libro);
  
    }
    @Transactional(readOnly = true)
    public List<Libro> buscarTodosLibro(){
       return libroRepository.findAll();
    }
}
