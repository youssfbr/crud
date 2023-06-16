package com.github.youssfbr.crud.services.interfaces;

import com.github.youssfbr.crud.dtos.ProductRequestDTO;
import com.github.youssfbr.crud.dtos.ProductResponseDTO;

import java.util.List;

public interface IProductService {

    List<ProductResponseDTO> getAll();
    ProductResponseDTO create(ProductRequestDTO dto);
}
