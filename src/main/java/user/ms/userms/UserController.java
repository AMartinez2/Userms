package user.ms.userms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import user.ms.userms.entity.User;
import user.ms.userms.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @CrossOrigin()
    @GetMapping ("/allUsers")
    public List<User> getAll () {
        return userRepository.findAll();
    }

    @GetMapping("/usid/{usid}")
    public User getUserByUsid (@PathVariable String usid) {
        User result = userRepository.findByUsid(usid);
        return result;
    }
}