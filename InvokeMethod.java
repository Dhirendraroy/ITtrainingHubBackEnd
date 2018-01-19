package com.Calling;

import com.DaoImpl.UserDaoImpl;

public class InvokeMethod {

	public static void main(String[] args) 
	{
		System.out.println("HI");
		// TODO Auto-generated method stub
		UserDaoImpl userObj=new UserDaoImpl();
		userObj.show("dhirendrapacex@gmail.com","Dhirendra","8853997903","202, RC indore","123","India");
		
		

	}

}
