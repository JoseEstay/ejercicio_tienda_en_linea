package com.example.tienda_online.mapper;

import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;
import com.example.tienda_online.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toModel(ClienteRequestDTO request){
        Cliente cliente = new Cliente();
        cliente.setNombre(request.nombre());
        cliente.setApellido(request.apellido());
        cliente.setDireccion(request.direccion());
        cliente.setCorreo(request.correo());
        cliente.setTelefono(request.telefono());
        return cliente;
    }

    public ClienteResponseDTO toDTO(Cliente cliente){
        return ClienteResponseDTO.builder()
                .id_cliente(cliente.getId_cliente())
                .nombre(cliente.getNombre())
                .correo(cliente.getCorreo())
                .build();
    }

}