package com.fortun.credmanback.models.dao;

import com.fortun.credmanback.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDAO extends CrudRepository<User, Long> {
}
