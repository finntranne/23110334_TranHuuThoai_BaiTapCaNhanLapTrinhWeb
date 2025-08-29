package vn.iostar.Services;

import vn.iostar.Model.User;

public interface IUserServices {
	
	User login(String username, String password);
	
	User FindByUserName(String username);
	

}
