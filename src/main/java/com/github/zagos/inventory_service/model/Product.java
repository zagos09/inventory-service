package com.github.zagos.inventory_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min; // <--- ΝΕΟ
import jakarta.validation.constraints.NotBlank; // <--- ΝΕΟ
import jakarta.validation.constraints.Positive; // <--- ΝΕΟ
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Το όνομα δεν μπορεί να είναι κενό") // Δεν επιτρέπει "" ή "   "
    private String name;

    private String description;

    @Positive(message = "Η τιμή πρέπει να είναι μεγαλύτερη από 0") // Μόνο θετικοί αριθμοί
    private Double price;

    @NotBlank(message = "Η κατηγορία είναι υποχρεωτική")
    private String category;

    private String scent;

    @Min(value = 0, message = "Το απόθεμα δεν μπορεί να είναι αρνητικό") // Από 0 και πάνω
    private Integer stock;

    private String imageUrl;
}