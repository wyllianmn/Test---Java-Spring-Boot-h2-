package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    public ClienteRepository clienteRepository;

    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    public Cliente inserir(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }
}
