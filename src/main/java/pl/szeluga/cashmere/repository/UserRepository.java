package pl.szeluga.cashmere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szeluga.cashmere.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
