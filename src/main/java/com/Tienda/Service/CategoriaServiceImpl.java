package com.Tienda.Service;



import com.Tienda.domain.Categoria;
import com.Tienda.dao.CategoriaDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class CategoriaImpServices implements Categoriaervices {

    @Autowired
    private CategoriaDAO categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria>getCategorias(boolean activo){
        var lista= (List<Categoria>) categoriaDao.findAll();
        if(activo){
            lista.removeIf(e->.isActivo());
           
        }
        return lista;
    }
    
    
    public List<Categoria> getAllCategoria() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public Categoria save(Categoria cliente) {
       return categoriaDao.save(cliente);
    }

    @Override
    @Transactional
    public Categoria delete(Categoria cliente) {
       categoriaDao.delete(cliente);
        return cliente;
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria find(Long id) {
       return categoriaDao.findById(id).orElse(null);
    }

    
}
