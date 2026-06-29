package com.example.tienda_online.service;

import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;
import com.example.tienda_online.mapper.ClienteMapper;
import com.example.tienda_online.model.Cliente;
import com.example.tienda_online.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;
    private final ClienteMapper mapper;

    // Métodos
    @Override
    public ClienteResponseDTO crearCliente(ClienteRequestDTO request) {
        Cliente cliente = mapper.toModel(request);
        repository.save(cliente);
        return mapper.toDTO(cliente);
    }

    @Override
    public List<ClienteResponseDTO> obtenerClientes() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO) // cliente -> mapper.toDTO(cliente)
                .toList();
    }

    @Override
    public ClienteResponseDTO clienteById(Long id_cliente) {
        Cliente cliente = repository.findById(id_cliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        return mapper.toDTO(cliente);
    }
}