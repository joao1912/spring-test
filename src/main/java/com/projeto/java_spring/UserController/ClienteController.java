package com.projeto.java_spring.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.java_spring.model.Cliente;
import com.projeto.java_spring.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllCliente() {
        return clienteService.getAllCliente();
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {

        return clienteService.saveCliente(cliente);
       
    }
    
}
