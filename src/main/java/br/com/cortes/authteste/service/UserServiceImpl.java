package br.com.cortes.authteste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cortes.authteste.entity.User;
import br.com.cortes.authteste.repository.UserRepository;

@Service(value = "userService")
public class UserServiceImpl implements  UserService {
	
	@Autowired
	private UserRepository userDao;

	
	@Override
	public void delete(long id) {
		userDao.delete(id);
	}

	@Override
    public User save(User user) {
        return userDao.save(user);
    }
}

