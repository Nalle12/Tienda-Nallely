package com.Tienda.Services;

import com.Tienda.Models.Clientes;
import java.util.List;



public interface clienteServices {
    
    public List<Clientes> getAllClientes();

    public Clientes save(Clientes cliente);

    public Clientes delete(Clientes cliente);

    public Clientes find(Long id);




    
}
