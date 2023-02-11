package com.learnmicroservice.productservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learnmicroservice.productservice.dto.ProductRequest;

import com.learnmicroservice.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;


import java.math.BigDecimal;



@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {
    @Container
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:6.0.2");

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ProductRepository productRepository;

    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
        dynamicPropertyRegistry.add("spring.data.mongo.uri", mongoDBContainer::getReplicaSetUrl);

    }

    @Test
    void shouldCreateProduct() throws Exception {
        ProductRequest productRequest = getProductRequest();
        String productRequestString = objectMapper.writeValueAsString(productRequest);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
                .contentType(MediaType.APPLICATION_JSON)
                .content(productRequestString)
                ).andExpect(MockMvcResultMatchers.status().isCreated());
     /*   Assertions.assertEquals(3,productRepository.findAll().size());*/
    }

    private ProductRequest getProductRequest() {
        return ProductRequest.builder().name("Iphone 13").description("desss").price(BigDecimal.valueOf(1200)).build();
    }

}
