package com.fortun.credmanback.controllers;

import com.fortun.credmanback.models.entity.User;
import com.fortun.credmanback.models.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> index() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User show(@PathVariable Long id) {
        return this.userService.findById(id);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@ModelAttribute User user) {
        this.userService.save(user);
        return user;
    }

    @PutMapping("/users/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@ModelAttribute User user, @PathVariable Long id) {
        User currentUser = this.userService.findById(id);
        currentUser.setNameUser(user.getNameUser());
        currentUser.setPasswordUser(user.getPasswordUser());
        this.userService.save(currentUser);
        return currentUser;
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.userService.delete(id);
    }
}
