package com.github.youssfbr.crud.controllers;

import com.github.youssfbr.crud.services.interfaces.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    @GetMapping
    public String test() {
        return "Test";
    }
}
