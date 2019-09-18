package com.wp.emp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DMLEmp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		System.out.println("\n1.Delete Employee");
		System.out.println("\n2.Update Employee");
		System.out.println("\nEnter your Choice");
		
		int choice=0;
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("\nEnter Employee No to Delete");
			int eno=sc.nextInt();
			Emp emp=session.get(Emp.class, eno);
			
			
			session.delete(emp);
			System.out.println("\nRecord Deleted");
			tr.commit();
			break;
		}
		
		case 2:
		{
			System.out.println("\nEnter Employee No to Update");
			int eno=sc.nextInt();
			Emp emp=session.get(Emp.class, eno);
			emp.setEname("DDD");
			session.update(emp);
			System.out.println("\nRecord Updated");
			tr.commit();
			break;
		}
		
		

	}
		session.close();
		sc.close();
	}
}


