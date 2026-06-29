package com.example.tienda_online.repository;


import com.example.tienda_online.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository  extends JpaRepository<Producto, Long> {
}