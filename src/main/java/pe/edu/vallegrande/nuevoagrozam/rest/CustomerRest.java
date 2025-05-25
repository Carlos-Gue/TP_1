package pe.edu.vallegrande.nuevoagrozam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.vallegrande.nuevoagrozam.model.Customer;
import pe.edu.vallegrande.nuevoagrozam.service.CustomerService;

import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")   //Permitir Conexión con Angular
@RestController
@RequestMapping("/v1/api/customer")
public class CustomerRest {

    private final CustomerService customerService;

    @Autowired
    public CustomerRest(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping
    public List <Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/state/{state}")
    public List<Customer> findByState(@PathVariable String state) {
        return customerService.findByState(state);
    }

    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/update/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @PatchMapping("/delete/{id}")
    public Customer delete(@PathVariable Long id) {
        return customerService.delete(id);
    }

    @PatchMapping("/restore/{id}")
    public Customer restore(@PathVariable Long id) {
        return customerService.restore(id);
    }

}
