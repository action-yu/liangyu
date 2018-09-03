package com;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class userimpl  extends HibernateDaoSupport implements userdao{

	public Users login(String username, String password) {
		List<Users>list = getHibernateTemplate().find("from Users where username=? and password=?",username,password);
		return list.size()==0?null:list.get(0);
	}

	public void register(Users u) {
		getHibernateTemplate().save(u);
		
	}

}
