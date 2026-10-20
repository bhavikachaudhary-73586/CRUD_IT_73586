
package com.example.crud_it_73586;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    // READ: Get all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    // READ: Get one customer
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Customer not found"));
    }

    // CREATE: Add a customer
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
        customer.setName(customer.getName().trim());
        return repository.save(customer);
    }

    // UPDATE: Edit a customer
    @PutMapping("/{id}")
    public Customer updateCustomer(
            @PathVariable Long id,
            @RequestBody Customer updatedCustomer) {

        Customer customer = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Customer not found"));

        customer.setName(updatedCustomer.getName().trim());
        customer.setEmail(updatedCustomer.getEmail());

        return repository.save(customer);
    }

    // DELETE: Remove a customer
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer not found");
        }

        repository.deleteById(id);
    }
}
