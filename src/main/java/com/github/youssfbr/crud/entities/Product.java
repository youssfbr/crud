package com.github.youssfbr.crud.entities;

import com.github.youssfbr.crud.dtos.ProductRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_products")
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    public Product(ProductRequestDTO dto) {
        BeanUtils.copyProperties(dto, this);
    }
}
