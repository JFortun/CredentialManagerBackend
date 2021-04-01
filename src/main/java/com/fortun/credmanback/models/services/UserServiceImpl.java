package com.fortun.credmanback.models.services;

import com.fortun.credmanback.models.dao.IUserDAO;
import com.fortun.credmanback.models.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDAO userDAO;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) userDAO.findAll();
    }
}
