package com.example.demo.controller;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    public ClienteService clienteService;

    @GetMapping
    public List<Cliente> clienteList(){
        return clienteService.listar();
    }

    @PostMapping
    public Cliente inserir(@RequestBody Cliente cliente){
        return  clienteService.inserir(cliente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        clienteService.deletar(id);
    }

}
