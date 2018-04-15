package kazusato.hajibootthymeleaf.repository;

import kazusato.hajibootthymeleaf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
