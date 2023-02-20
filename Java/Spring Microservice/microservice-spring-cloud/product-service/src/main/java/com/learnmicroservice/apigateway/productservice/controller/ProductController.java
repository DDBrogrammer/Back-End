package com.learnmicroservice.apigateway.productservice.controller;

import com.learnmicroservice.apigateway.productservice.dto.ProductRequest;
import com.learnmicroservice.apigateway.productservice.dto.ProductResponse;
import com.learnmicroservice.apigateway.productservice.service.ProductService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    @NonNull
    private ProductService productService;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
     productService.createProduct(productRequest);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct(){
      return  productService.getAllProducts();
    }
}
