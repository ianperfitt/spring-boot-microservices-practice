package com.example.orderservice;

import com.example.orderservice.clients.Product;
import com.example.orderservice.clients.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    public Product getProductById(Long id) {

        return productClient.getProductById(id);
    }
}