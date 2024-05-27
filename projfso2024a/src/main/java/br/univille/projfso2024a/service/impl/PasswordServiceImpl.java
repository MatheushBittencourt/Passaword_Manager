package br.univille.projfso2024a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfso2024a.entity.Password;
import br.univille.projfso2024a.repository.PasswordRepository;
import br.univille.projfso2024a.service.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService {
    
    @Autowired
    private PasswordRepository repository;
    
    @Override
    public void save(Password password) {
        repository.save(password);
    }

    @Override
    public Password getById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Password> getAll() {
        return repository.findAll();
    }

    @Override
    public Password delete(long id) {
        var password = getById(id);
        if (password != null) {
            repository.deleteById(id);
        }
        return password;
    }
}
