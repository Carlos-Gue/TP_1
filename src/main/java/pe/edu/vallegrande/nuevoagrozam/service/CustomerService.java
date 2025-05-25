package pe.edu.vallegrande.nuevoagrozam.service;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.nuevoagrozam.model.Customer;

public interface CustomerService {

    List<Customer> findAll();

    List<Customer> findByState(String state);

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    Customer delete(Long id);

    Customer restore(Long id);
    
}