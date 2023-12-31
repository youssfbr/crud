package com.github.youssfbr.crud.repositories;

import com.github.youssfbr.crud.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProductRepository extends JpaRepository<Product, UUID> {
}
