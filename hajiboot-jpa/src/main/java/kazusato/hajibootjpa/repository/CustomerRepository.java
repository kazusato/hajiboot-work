package kazusato.hajibootjpa.repository;

import kazusato.hajibootjpa.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
