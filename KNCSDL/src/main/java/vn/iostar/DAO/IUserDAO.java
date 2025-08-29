package vn.iostar.DAO;

import java.util.List;

import vn.iostar.Model.User;

public interface IUserDAO {
	
	List<User> findAll();
	
	User findById(int id);
	
	void insert(User user);
	
	User findByUserName(String username);
}
