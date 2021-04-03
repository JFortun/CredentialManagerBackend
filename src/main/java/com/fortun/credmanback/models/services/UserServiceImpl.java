package com.fortun.credmanback.models.services;

import com.fortun.credmanback.models.dao.IUserDAO;
import com.fortun.credmanback.models.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) userDAO.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDAO.deleteById(id);
    }
}
