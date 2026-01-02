package com.github.zagos.inventory_service.repository;

import com.github.zagos.inventory_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // ΜΑΓΕΙΑ: Γράφεις findBy + το όνομα του πεδίου, και καταλαβαίνει τι να κάνει!
    java.util.List<Product> findByCategory(String category);
}