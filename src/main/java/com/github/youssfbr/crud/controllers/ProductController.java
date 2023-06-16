package com.github.youssfbr.crud.controllers;

import com.github.youssfbr.crud.dtos.ProductRequestDTO;
import com.github.youssfbr.crud.dtos.ProductResponseDTO;
import com.github.youssfbr.crud.services.interfaces.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    @GetMapping
    public List<ProductResponseDTO> getAll() {
        return productService.getAll();
    }

    @PostMapping
    public ProductResponseDTO create(@RequestBody ProductRequestDTO dto) {
        return productService.create(dto);
    }
}
