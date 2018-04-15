package kazusato.hajibootthymeleaf.service;

import kazusato.hajibootthymeleaf.domain.Customer;
import kazusato.hajibootthymeleaf.domain.User;
import kazusato.hajibootthymeleaf.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAllWithUserOrderByName();
    }

    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    public Customer findOne(Integer id) {
        return customerRepository.findOne(id);
    }

    public Customer create(Customer customer, User user) {
        customer.setUser(user);
        return customerRepository.save(customer);
    }

    public Customer update(Customer customer, User user) {
        customer.setUser(user);
        return customerRepository.save(customer);
    }

    public void delete(Integer id) {
        customerRepository.delete(id);
    }

}
