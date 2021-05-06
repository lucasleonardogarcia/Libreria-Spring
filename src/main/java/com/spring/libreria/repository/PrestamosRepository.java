package com.spring.libreria.repository;

import com.spring.libreria.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PrestamosRepository extends JpaRepository<Prestamo, String> {

}
