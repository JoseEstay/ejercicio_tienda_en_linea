package com.example.tienda_online.mapper;

import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;
import com.example.tienda_online.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public Producto toModel(ProductoRequestDTO request){
        Producto producto = new Producto();
        producto.setNombre(request.nombre());
        producto.setDescripcion(request.descripcion());
        producto.setPrecio(request.precio());
        producto.setStock(request.stock());
        producto.setCategoria(request.categoria());
        return producto;
    }

    public ProductoResponseDTO toDTO(Producto producto){
        return ProductoResponseDTO.builder()
                .id_cliente(producto.getId_cliente())
                .nombre(producto.getNombre())
                .stock(producto.getStock())
                .build();
    }
}