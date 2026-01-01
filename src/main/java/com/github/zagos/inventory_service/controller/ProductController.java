package com.github.zagos.inventory_service.controller;

import com.github.zagos.inventory_service.model.Product;
import com.github.zagos.inventory_service.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // 1. Dependency Injection: Ζητάμε από το Spring να μας φέρει το Repository
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // 2. GET: Διάβασε από τη Βάση (SELECT * FROM products)
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 3. POST: Αποθήκευσε στη Βάση (INSERT INTO products...)
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // 4. DELETE: Σβήσε από τη Βάση (DELETE FROM products WHERE id=...)
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}