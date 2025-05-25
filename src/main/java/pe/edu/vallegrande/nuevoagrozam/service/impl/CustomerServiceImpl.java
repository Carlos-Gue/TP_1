package pe.edu.vallegrande.nuevoagrozam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import pe.edu.vallegrande.nuevoagrozam.model.Customer;
import pe.edu.vallegrande.nuevoagrozam.repository.CustomerRepository;
import pe.edu.vallegrande.nuevoagrozam.service.CustomerService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        log.info("Listando Datos: ");
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findByState(String state) {
        log.info("Listando Datos por Estado: " + state);
        return customerRepository.findByState(state);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        log.info("Listando Datos por ID: " + id);
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        log.info("Registrondo Datos: " + customer.toString());
        customer.setState("A");
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        log.info("Editando Datos: " + customer.toString());
        customer.setState("A");
        return customerRepository.save(customer);
    }

    @Override
    public Customer delete(Long id) {
        log.info("Eliminando Datos: " + id);
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setState("I");
        return customerRepository.save(customer);
    }

    @Override
    public Customer restore(Long id) {
        log.info("Restaurando Datos: " + id);
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setState("A");
        return customerRepository.save(customer);
    }

}