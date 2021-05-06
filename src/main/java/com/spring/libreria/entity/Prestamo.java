

package com.spring.libreria.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
   @Temporal(TemporalType.DATE)
    private Date fecha;
   
   @Temporal(TemporalType.DATE)
    private Date devolucion;

    public Prestamo(String Id, Date fecha, Date devolucion) {
        this.Id = Id;
        this.fecha = fecha;
        this.devolucion = devolucion;
    }

    public Prestamo() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }
    

}
