package com.example.tienda_online.dto;

import lombok.Builder;

@Builder
public record ProductoResponseDTO(
        Long id_cliente,
        String nombre,
        Integer stock
) {
}
