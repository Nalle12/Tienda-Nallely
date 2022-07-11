
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
@Table(name="articulo")
public class Articulo implements Serializable{
      private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Articulo")
    private Long idArticulo;
    private double idCategoria;
    private double descripcion;
    private double detalle;
    private double precio;
    private double existencia;
    private double activo;

    public Articulo() {
        
    }

    public Articulo(double idCategoria, double descripcion, double detalle, double precio, double existencia, double activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.activo = activo;
    }

    
}
