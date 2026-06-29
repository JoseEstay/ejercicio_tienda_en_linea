package com.example.tienda_online.service;

import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {
    ClienteResponseDTO crearCliente(ClienteRequestDTO request);
    List<ClienteResponseDTO> obtenerClientes();
    ClienteResponseDTO clienteById(Long id_cliente);
}
