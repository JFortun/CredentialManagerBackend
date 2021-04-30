package com.fortun.credmanback.models.dao;

import com.fortun.credmanback.models.entity.Credential;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICredentialDAO extends CrudRepository<Credential, Long> {

    List<Credential> findAllByIdUserFK(Long idUserFK);
}
