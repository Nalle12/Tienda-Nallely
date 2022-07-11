package com.Tienda.Service;

/*package com.Tienda.Services;

import com.Tienda.Models.Clientes;
import com.Tienda.dao.ClienteDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ClienteImpServices implements clienteServices {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Clientes> getAllClientes() {
        return (List<Clientes>) clienteDAO.findAll();
    }

    @Override
    @Transactional
    public Clientes save(Clientes cliente) {
       return clienteDAO.save(cliente);
    }

    @Override
    @Transactional
    public Clientes delete(Clientes cliente) {
       clienteDAO.delete(cliente);
        return cliente;
    }

    @Override
    @Transactional(readOnly = true)
    public Clientes find(Long id) {
       return clienteDAO.findById(id).orElse(null);
    }

    
}
*/
