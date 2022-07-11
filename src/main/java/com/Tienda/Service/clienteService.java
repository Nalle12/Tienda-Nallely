package com.Tienda.Service;

import com.Tienda.Models.Clientes;
import java.util.List;



public interface clienteService {
    
    public List<Clientes> getAllClientes();

    public Clientes save(Clientes cliente);

    public Clientes delete(Clientes cliente);

    public Clientes find(Long id);




    
}
