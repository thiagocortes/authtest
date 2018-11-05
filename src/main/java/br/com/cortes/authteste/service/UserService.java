package br.com.cortes.authteste.service;

import java.util.List;

import br.com.cortes.authteste.entity.User;

public interface UserService {
	
    User save(User user);
 
    void delete(long id);

}
