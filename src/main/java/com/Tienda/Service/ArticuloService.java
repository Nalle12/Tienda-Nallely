package com.Tienda.Service;
import com.Tienda.domain.Articulo;
import java.util.List;



public interface ArticuloService {
    
    public List<Articulo> getArticulo();

    public Articulo save(Articulo articulo);

    public Articulo delete(Articulo categoria);

    public Articulo find(Long id);




    
}