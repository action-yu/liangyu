package com;

public class useraction {
	userdao userdao;
	Users u;
	
	

	public userdao getUserdao() {
		return userdao;
	}

	public void setUserdao(userdao userdao) {
		this.userdao = userdao;
	}

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}

	public String login(){
		Users us = userdao.login(u.getUsername(), u.getPassword());
		if(us==null){
			return"login";
		}else{
			return"index";
		}
	}
	
	public String register(){
		userdao.register(u);
		return"login";
	}
}
