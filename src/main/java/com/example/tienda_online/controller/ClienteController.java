package com.example.tienda_online.controller;

import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;
import com.example.tienda_online.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService service;

    @PostMapping
    public ClienteResponseDTO crearCliente(@RequestBody ClienteRequestDTO request){
        return service.crearCliente(request);
    }

    @GetMapping
    public List<ClienteResponseDTO> obtenerClientes(){
        return service.obtenerClientes();
    }

    @GetMapping("/{id_cliente}")
    public ClienteResponseDTO clienteById(@PathVariable Long id_cliente){
        return service.clienteById(id_cliente);
    }
    }