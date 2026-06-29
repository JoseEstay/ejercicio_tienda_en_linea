package com.example.tienda_online.dto;

import java.math.BigDecimal;

public record ProductoRequestDTO(
        String nombre,
        String descripcion,
        BigDecimal precio,
        Integer stock,
        String categoria
) {
}
