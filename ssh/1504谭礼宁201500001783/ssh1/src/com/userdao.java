package com;

public interface userdao {
	public Users login(String username,String password);
	public void register(Users u);
}
