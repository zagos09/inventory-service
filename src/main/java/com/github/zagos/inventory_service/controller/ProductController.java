package com.github.zagos.inventory_service.controller;

import com.github.zagos.inventory_service.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // Αυτή είναι η "ψεύτικη" βάση δεδομένων μας (μια απλή λίστα στη μνήμη)
    private List<Product> products = new ArrayList<>();

    // Constructor: Βάζουμε μερικά ψεύτικα προϊόντα για να μην είναι άδεια η λίστα στην αρχή
    public ProductController() {
        products.add(new Product(1L, "iPhone 15", "Apple Smartphone", 999.99));
        products.add(new Product(2L, "Samsung S24", "Android Smartphone", 899.99));
    }

    // 1. GET: Δώσε μου όλα τα προϊόντα
    // URL: http://localhost:8080/api/products
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    // 2. POST: Πρόσθεσε νέο προϊόν
    // URL: http://localhost:8080/api/products
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}