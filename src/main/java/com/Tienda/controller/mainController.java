package com.Tienda.controller;

import com.Tienda.Models.Clientes;
import com.Tienda.Services.ClienteImpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class mainController {

    @Autowired
    private ClienteImpServices clienteServices;

    @GetMapping("/")
    public String index(Model model) {
        var clientes = clienteServices.getAllClientes();
        model.addAttribute("clientes", clientes);
        return "index";
    }

    @GetMapping("/new")
    public String newCliente(Model model) {
        model.addAttribute("cliente", new Clientes());
        return "new";
    }

    @PostMapping("/save")
    public String saveCliente(Clientes cliente) {
        clienteServices.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Clientes cliente = clienteServices.find(id);
        clienteServices.delete(cliente);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Clientes cliente = clienteServices.find(id);
        model.addAttribute("cliente", cliente);
        return "edit";
    }

    @PostMapping("/update")
    public String update(Clientes cliente) {
        clienteServices.save(cliente);
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, Clientes cliente) {
        cliente.setId(id);
        clienteServices.save(cliente);
        return "redirect:/";
    }

    
}
