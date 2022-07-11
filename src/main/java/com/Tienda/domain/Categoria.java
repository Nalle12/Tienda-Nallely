
package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "credito")
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Categoria")
    private Long idDescripcion;
    private double activo;

    public Categoria() {

    }

    
    public Categoria(Long idDescripcion, double activo) {
        this.idDescripcion = idDescripcion;
        this.activo = activo;
    }

    

}
