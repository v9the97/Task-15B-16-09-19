package com.wp.emp;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		
		Session session=Util.getSF().openSession();
		Emp emp=session.get(Emp.class, 111);
		System.out.println("Employee No : "+emp.getEno());
		System.out.println("Employee Name : "+emp.getEname());
		System.out.println("Employee Salary : "+emp.getSal());
		System.out.println("Employee Laptop Code : "+emp.getLaptop().getCode());
		System.out.println("Employee Laptop Brand : "+emp.getLaptop().getBrand());
		System.out.println("Employee Laptop Price : "+emp.getLaptop().getPrice());
		System.out.println("Employee Vehicle Registration No : "+emp.getVehicle().getRegno());
		System.out.println("Employee Vehicle Brand : "+emp.getVehicle().getBrand());
		System.out.println("Employee Vehicle Model : "+emp.getVehicle().getModel());
		System.out.println("Employee Vehicle Price : "+emp.getVehicle().getPrice());
		session.close();
	}
}
