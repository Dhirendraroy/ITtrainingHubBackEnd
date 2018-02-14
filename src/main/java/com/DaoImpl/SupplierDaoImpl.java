package com.DaoImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.*;

import com.Dao.SupplierDao;
import com.Model.Supplier;
//import org.springframework.stereotype.Service;


@Repository
//@Service
public class SupplierDaoImpl implements SupplierDao
{
	//@Autowired
	SessionFactory sessionFactory;
	//@Autowire
	public SupplierDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public void insertSupplier(Supplier supplier)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(supplier);
		session.getTransaction().commit();
	}
	
	
	

	
}
