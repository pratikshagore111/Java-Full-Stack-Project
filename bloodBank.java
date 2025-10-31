
package com.bbms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class BloodStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bloodGroup; // e.g., "A+", "O-"
    private int quantityUnits; // Number of blood units
    private LocalDate expiryDate;
    private String bloodBankName;

    // Getters and Setters (omitted for brevity)
    // Constructors (omitted for brevity)
}
