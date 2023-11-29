package pl.szeluga.cashmere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.szeluga.cashmere.dto.UserDto;
import pl.szeluga.cashmere.dtoService.UserDtoService;
import pl.szeluga.cashmere.entity.User;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserDtoService userDtoService;

    @PostMapping("/save")
    public void save(@RequestBody UserDto userDto) {
        userDtoService.save(userDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        userDtoService.deleteById(id);
    }

    @GetMapping("/findall")
    public List<User> findAll() {
        return userDtoService.findAll();
    }

    @GetMapping("/get/{id}")
    public User getReferenceById(@PathVariable Long id) {
        return userDtoService.getReferenceById(id);
    }
}
