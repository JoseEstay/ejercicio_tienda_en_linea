package com.example.tienda_online.service;

import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;
import com.example.tienda_online.mapper.ProductoMapper;
import com.example.tienda_online.model.Producto;
import com.example.tienda_online.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    @Override
    public ProductoResponseDTO crearProducto(ProductoRequestDTO request) {
        Producto producto = mapper.toModel(request);
        repository.save(producto);
        return mapper.toDTO(producto);
    }

    @Override
    public List<ProductoResponseDTO> obtenerProductos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ProductoResponseDTO productoById(Long id_cliente) {
        Producto producto = repository.findById(id_cliente)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return mapper.toDTO(producto);
    }

    @Override
    public void eliminarProducto(Long id_cliente) {
        repository.deleteById(id_cliente);
    }
}