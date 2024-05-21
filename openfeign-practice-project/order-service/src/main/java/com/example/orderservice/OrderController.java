package com.example.orderservice;

import com.example.orderservice.clients.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/{id}/product")
    public Product getProductById(@PathVariable Long id) {

        return orderService.getProductById(id);
    }
}