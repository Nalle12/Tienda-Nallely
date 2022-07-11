package com.Tienda.domain;

import static com.fasterxml.jackson.databind.util.ClassUtil.name;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import static org.apache.tomcat.jni.Lock.name;

@Data
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    @JoinColumn(name="id_credito"referencedColumnName  = "id_credito")
    @ManyToOne
    private Credito credito;

    public Cliente() {

    }

    public Cliente(Long idCliente, String nombre, String apellidos, String correo, String telefono, Credito credito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.credito = credito;
    }

}
