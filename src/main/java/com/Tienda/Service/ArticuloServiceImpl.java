package com.Tienda.Service;



import com.Tienda.domain.Articulo;
import com.Tienda.dao.ArticuloDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ArticuloImpServices implements Articuloervices {

    @Autowired
    private ArticuloDAO categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo>getArticulos(boolean activo){
        var lista= (List<Articulo>) categoriaDao.findAll();
        if(activo){
            lista.removeIf(e->.isActivo());
           
        }
        return lista;
    }
    
    
    public List<Articulo> getAllArticulo() {
        return (List<Articulo>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public Articulo save(Articulo cliente) {
       return categoriaDao.save(cliente);
    }

    @Override
    @Transactional
    public Articulo delete(Articulo cliente) {
       categoriaDao.delete(cliente);
        return cliente;
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo find(Long id) {
       return categoriaDao.findById(id).orElse(null);
    }

    
}
