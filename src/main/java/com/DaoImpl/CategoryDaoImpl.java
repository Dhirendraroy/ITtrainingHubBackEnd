package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Dao.CategoryDao;
import com.Model.Category;


public class CategoryDaoImpl implements CategoryDao
{

	//@Autowired
	SessionFactory sessionFactory;
	//@Autowire
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public void insertCategory(Category category)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(category);
		session.getTransaction().commit();
	}
	
	
	

}
