package com.fortun.credmanback.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "credentials")
public class Credential implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credential")
    private Long idCredential;

    @Column(name = "name_credential")
    private String nameCredential;

    @Column(name = "user_credential")
    private String userCredential;

    @Column(name = "password_credential")
    private String passwordCredential;

    @Column(name = "id_user_fk")
    private Long idUserFK;

    public Long getIdCredential() {
        return idCredential;
    }

    public void setIdCredential(Long idCredential) {
        this.idCredential = idCredential;
    }

    public String getNameCredential() {
        return nameCredential;
    }

    public void setNameCredential(String nameCredential) {
        this.nameCredential = nameCredential;
    }

    public String getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(String userCredential) {
        this.userCredential = userCredential;
    }

    public String getPasswordCredential() {
        return passwordCredential;
    }

    public void setPasswordCredential(String passwordCredential) {
        this.passwordCredential = passwordCredential;
    }

    public Long getIdUserFK() {
        return idUserFK;
    }

    public void setIdUserFK(Long idUserFK) {
        this.idUserFK = idUserFK;
    }
}
