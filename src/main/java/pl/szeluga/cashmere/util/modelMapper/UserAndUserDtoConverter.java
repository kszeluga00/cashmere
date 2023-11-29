package pl.szeluga.cashmere.util.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.szeluga.cashmere.dto.UserDto;
import pl.szeluga.cashmere.entity.User;

@Service
public class UserAndUserDtoConverter {

    public User convertUserDtoToUser(UserDto userDto) {
        return new ModelMapper().map(userDto, User.class);
    }

    public UserDto convertUserToUserDto(User user) {
        return new ModelMapper().map(user, UserDto.class);
    }
}
