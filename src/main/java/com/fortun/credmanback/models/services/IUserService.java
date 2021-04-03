package com.fortun.credmanback.models.services;

import com.fortun.credmanback.models.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User save(User user);

    User findById(Long id);

    void delete(Long id);

}
