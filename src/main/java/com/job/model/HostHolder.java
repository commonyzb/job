package com.job.model;

import org.springframework.stereotype.Component;

@Component
public class HostHolder {
	
	private ThreadLocal<User> users = new ThreadLocal<User>();
	
	public void setUsers(User user) {
		users.set(user);
	}
	
	public User getUser() {
		return  (User) users.get();
	}
	
	public void clear() {
		users.remove();
	}
	
}
