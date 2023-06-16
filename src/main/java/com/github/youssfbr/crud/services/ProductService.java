package com.github.youssfbr.crud.services;

import com.github.youssfbr.crud.dtos.ProductRequestDTO;
import com.github.youssfbr.crud.dtos.ProductResponseDTO;
import com.github.youssfbr.crud.entities.Product;
import com.github.youssfbr.crud.repositories.IProductRepository;
import com.github.youssfbr.crud.services.interfaces.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProductResponseDTO> getAll() {
        return productRepository.findAll()
                .stream()
                .map(ProductResponseDTO::new)
                .toList();
    }

    @Override
    @Transactional
    public ProductResponseDTO create(ProductRequestDTO dto) {
        Product entityToSave = new Product(dto);
        Product entitySaved = productRepository.save(entityToSave);
        return new ProductResponseDTO(entitySaved);
    }
}
