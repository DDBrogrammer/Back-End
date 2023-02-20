package com.learnmicroservice.apigateway.productservice.service;

import com.learnmicroservice.apigateway.productservice.dto.ProductRequest;
import com.learnmicroservice.apigateway.productservice.dto.ProductResponse;
import com.learnmicroservice.apigateway.productservice.repository.ProductRepository;
import com.learnmicroservice.apigateway.productservice.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // import constructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;




    public void createProduct(ProductRequest productRequest){
       Product product= Product.builder()
               .name(productRequest.getName())
               .price(productRequest.getPrice())
               .description(productRequest.getDescription())
               .build();
       productRepository.save(product);
       log.info("Product"+product.getId());
   }

   public List<ProductResponse> getAllProducts( ){
        List<Product> products=productRepository.findAll();
        return products.stream().map(this :: mapToProductResponse).toList();
   }

   private ProductResponse mapToProductResponse(Product product){
        return  ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();
   }
}
