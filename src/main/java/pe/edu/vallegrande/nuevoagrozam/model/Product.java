package pe.edu.vallegrande.nuevoagrozam.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "product_name", nullable = false, length = 100)
    private String productName;

    @Column(name = "product_description", nullable = false, length = 100)
    private String productDescription;

    @Column(name = "expiration_date", nullable = false)
    private LocalDate expirationDate;

    @Column(name = "unit_if_measure", nullable = false, length = 3)
    private String unitOfMeasure;

    @Column(name = "product_price", nullable = false, precision = 10, scale = 2)
    private Double productPrice;

    @Column(name = "admission_date", nullable = false)
    private LocalDate admissionDate;

    @Column(name = "current_stock", nullable = false, length = 100)
    private String currentStock;

    @Column(name = "active", length = 1)
    private String active = "A";
}
