package pl.szeluga.cashmere.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.szeluga.cashmere.entity.User;
import pl.szeluga.cashmere.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User getReferenceById(Long id) {
        return userRepository.getReferenceById(id);
    }


}
