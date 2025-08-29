package vn.iostar.Services.impl;

import vn.iostar.DAO.IUserDAO;
import vn.iostar.DAO.impl.UserDAOImpl;
import vn.iostar.Model.User;
import vn.iostar.Services.IUserServices;

public class UserServices implements IUserServices{
	IUserDAO userDao = new UserDAOImpl();

	@Override
	public User login(String username, String password) {
		User user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
			}
		return null;
	}

	@Override
	public User FindByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
