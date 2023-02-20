package com.example.orderservice.controller;

import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    @NonNull
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @CircuitBreaker(name = "inventory",fallbackMethod = "fallbackMethod")
    /*@TimeLimiter(name = "inventory")*/
    @Retry(name="inventory")
   /* public CompletableFuture<String> placeOrder(@RequestBody OrderRequest orderRequest){
        return CompletableFuture.supplyAsync(()-> orderService.placeOrder(orderRequest));
    }*/

    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return  orderService.placeOrder(orderRequest);
    }
    /*public CompletableFuture<String>  fallbackMethod(OrderRequest orderRequest, RuntimeException runtimeException){
        return CompletableFuture.supplyAsync(()->"Oops! Something went wrong, please order after some time!");
    }*/

    public String  fallbackMethod(OrderRequest orderRequest, RuntimeException runtimeException){
        return "Oops! Something went wrong, please order after some time!";
    }
}
