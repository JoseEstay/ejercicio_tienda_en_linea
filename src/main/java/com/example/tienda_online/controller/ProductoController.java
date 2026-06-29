package com.example.tienda_online.controller;

import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;
import com.example.tienda_online.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    @PostMapping
    public ProductoResponseDTO crearProducto(@RequestBody ProductoRequestDTO request) {
        return service.crearProducto(request);
    }

    @GetMapping
    public List<ProductoResponseDTO> obtenerProductos() {
        return service.obtenerProductos();
    }

    @GetMapping("/{id}")
    public ProductoResponseDTO productoById(@PathVariable("id") Long id_cliente) {
        return service.productoById(id_cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable("id") Long id_cliente) {
        service.eliminarProducto(id_cliente);
    }
}
