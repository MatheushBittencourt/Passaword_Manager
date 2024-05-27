package br.univille.projfso2024a.service;

import java.util.List;

import br.univille.projfso2024a.entity.Password;

public interface PasswordService {
    void save(Password password);
    Password getById(long id);
    List<Password> getAll();
    Password delete(long id);
}
