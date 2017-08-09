package com.vincent.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		//openSession() �� getCurrentSession() ��������ʲô��
		//Ϊʲôʹ��openSession() ���ԣ�ʹ��getCurrentSession() ����.
		return this.sessionFactory.getCurrentSession();
	}
}
