package com.fortun.credmanback.models.services;

import com.fortun.credmanback.models.dao.ICredentialDAO;
import com.fortun.credmanback.models.entity.Credential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CredentialServiceImpl implements ICredentialService {

    @Autowired
    private ICredentialDAO credentialDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Credential> findAll() {
        return (List<Credential>) credentialDAO.findAll();
    }

    @Override
    @Transactional
    public Credential save(Credential credential) {
        return credentialDAO.save(credential);
    }

    @Override
    @Transactional(readOnly = true)
    public Credential findById(Long id) {
        return credentialDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        credentialDAO.deleteById(id);
    }
}
