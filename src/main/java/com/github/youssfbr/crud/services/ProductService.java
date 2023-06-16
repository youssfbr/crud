package com.github.youssfbr.crud.services;

import com.github.youssfbr.crud.repositories.IProductRepository;
import com.github.youssfbr.crud.services.interfaces.IProductService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

}
