package pe.edu.vallegrande.nuevoagrozam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.vallegrande.nuevoagrozam.model.Product;
import pe.edu.vallegrande.nuevoagrozam.service.ProductService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*") // Permitir conexión con Angular u otros frontends
@RestController
@RequestMapping("/v1/api/product")
public class ProductRest {

    private final ProductService productService;

    @Autowired
    public ProductRest(ProductService productService) {
        this.productService = productService;
    }

    // Leer todos los productos
    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    // Leer un producto por ID
    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    // Crear un nuevo producto
    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    // Actualizar un producto existente
    @PutMapping("/update")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }

    // Eliminar un producto por ID
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
