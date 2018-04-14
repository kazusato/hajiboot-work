package kazusato.hajibootjpa;

import kazusato.hajibootjpa.domain.Customer;
import kazusato.hajibootjpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HajibootJpaApplication implements CommandLineRunner {

    @Autowired
	CustomerRepository customerRepository;

    @Override
    public void run(String... string) {
        Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
        System.out.println(created + " is created!");
        customerRepository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
		SpringApplication.run(HajibootJpaApplication.class, args);
	}
}
