package com.fortun.credmanback.controllers;

import com.fortun.credmanback.models.entity.Credential;
import com.fortun.credmanback.models.services.ICredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CredentialRestController {

    @Autowired
    private ICredentialService credentialService;

    @GetMapping("/credentials")
    public List<Credential> index() {
        return credentialService.findAll();
    }

    @GetMapping("/credentials/id/{id}")
    public Credential show(@PathVariable Long id) {
        return credentialService.findById(id);
    }

    @GetMapping("/credentials/user/{idUser}")
    public List<Credential> showCredential(@PathVariable Long idUser) {
        return this.credentialService.findAllByIdUserFK(idUser);
    }

    @PostMapping("/credentials")
    @ResponseStatus(HttpStatus.CREATED)
    public Credential create(@ModelAttribute Credential credential) {
        this.credentialService.save(credential);
        return credential;
    }

    @PutMapping("/credentials/id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Credential update(@ModelAttribute Credential credential, @PathVariable Long id) {
        Credential currentCredential = this.credentialService.findById(id);
        currentCredential.setNameCredential(credential.getNameCredential());
        currentCredential.setUserCredential(credential.getUserCredential());
        currentCredential.setPasswordCredential(credential.getPasswordCredential());
        currentCredential.setIdUserFK(credential.getIdUserFK());
        this.credentialService.save(currentCredential);
        return currentCredential;
    }

    @DeleteMapping("/credentials/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.credentialService.delete(id);
    }
}
