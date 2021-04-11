package com.fortun.credmanback.models.dao;

import com.fortun.credmanback.models.entity.Credential;
import org.springframework.data.repository.CrudRepository;

public interface ICredentialDAO extends CrudRepository<Credential, Long> {
}
