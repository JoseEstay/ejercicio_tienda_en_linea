package com.example.tienda_online.service;

import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;
import java.util.List;

public interface ProductoService {
    ProductoResponseDTO crearProducto(ProductoRequestDTO request);
    List<ProductoResponseDTO> obtenerProductos();
    ProductoResponseDTO productoById(Long id_cliente);
    void eliminarProducto(Long id_cliente);
}