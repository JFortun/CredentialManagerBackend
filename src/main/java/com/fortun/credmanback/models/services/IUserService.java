package com.fortun.credmanback.models.services;

import com.fortun.credmanback.models.entity.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public User save(User user);

    public User findById(Long id);

    public void delete(Long id);

}
