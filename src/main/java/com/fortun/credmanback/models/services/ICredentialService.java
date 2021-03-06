package com.fortun.credmanback.models.services;

import com.fortun.credmanback.models.entity.Credential;

import java.util.List;

public interface ICredentialService {

    List<Credential> findAll();

    Credential save(Credential credential);

    Credential findById(Long id);

    List<Credential> findAllByIdUserFK(Long id);

    void delete(Long id);
}
