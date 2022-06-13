
package com.Tienda.controller;

import com.Tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private ClienteDao clienteDao;
    
   @GetMapping("/")
   public String Inicio (Model model){
   log.info("Ahora utilizamos MVC");
       
     
      /* Cliente cliente= new Cliente("Nallely", "Alfaro", "nallelyalfaro02@gmail.com", "85483199");
       Cliente cliente2= new Cliente("Ana", "Alfaro", "nallelyalfaro02@gmail.com", "85483199");
       Cliente cliente3= new Cliente("Rosy", "Alfaro", "nallelyalfaro02@gmail.com", "85483199");
               
       var clientes = Arrays.asList(cliente, cliente2, cliente3);
       model.addAttribute("cliente", cliente);
       model.addAttribute("clientes", clientes);
    */
      
      var clientes = ClienteDao.findAll();
      model.addAttribute("clientes",clientes);
    return"index";
}
    
}
