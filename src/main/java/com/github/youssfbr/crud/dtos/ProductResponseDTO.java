package com.github.youssfbr.crud.dtos;

import com.github.youssfbr.crud.entities.Product;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponseDTO(UUID id, String name, BigDecimal price) {
    public ProductResponseDTO(Product entity) {
        this(entity.getId(), entity.getName(), entity.getPrice());
    }
}
