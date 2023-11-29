package pl.szeluga.cashmere.dtoService;

import org.springframework.stereotype.Service;
import pl.szeluga.cashmere.dto.UserDto;
import pl.szeluga.cashmere.entity.User;
import pl.szeluga.cashmere.service.UserService;
import pl.szeluga.cashmere.util.modelMapper.UserAndUserDtoConverter;

import java.util.List;

@Service
public class UserDtoService {
    private UserService userService;
    private UserAndUserDtoConverter userAndUserDtoConverter;

    public UserDtoService(UserService userService, UserAndUserDtoConverter userAndUserDtoConverter) {
        this.userService = userService;
        this.userAndUserDtoConverter = userAndUserDtoConverter;
    }

    public void save(UserDto userDto) {
        userService.save(convertUserDtoToUser(userDto));
    }

    public void deleteById(Long id) {
        userService.deleteById(id);
    }

    public List<User> findAll() {
        return userService.findAll();
    }

    public User getReferenceById(Long id) {
        return userService.getReferenceById(id);
    }

    public User convertUserDtoToUser(UserDto userDto) {
        return userAndUserDtoConverter.convertUserDtoToUser(userDto);
    }
}
