package com.Tienda.Service;

import com.Tienda.domain.Categoria;
import java.util.List;



public interface CategoriaService {
    
    public List<Categoria> getCategoria(boolean activo);

    public Categoria save(Categoria categoria);

    public Categoria delete(Categoria categoria);

    public Categoria find(Long id);




    
}