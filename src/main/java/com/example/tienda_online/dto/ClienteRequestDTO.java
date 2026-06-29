package com.example.tienda_online.dto;

public record ClienteRequestDTO(
        String nombre,
        String apellido,
        String correo,
        String telefono,
        String direccion
) {
}
