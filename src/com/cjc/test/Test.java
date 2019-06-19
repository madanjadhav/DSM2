package com.cjc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cjc.model.Department;
import com.cjc.model.Employee;
import com.cjc.util.SessionFactory_Util;

public class Test {
	
	public static void main(String[] args) {
		
		Session session=SessionFactory_Util.getSessionFac().openSession();
		Transaction tr=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEmp_name("Madan");
		e1.setAddress("Satara");
		
		
		Employee e2=new Employee();
		e2.setEmp_name("Amit");
		e2.setAddress("Wai");
		
		Employee e3=new Employee();
		e3.setEmp_name("Ravi");
		e3.setAddress("Ambegaon");
		
		Department d1=new Department();
		d1.setDep_name("IT-DEP");
		d1.getEmployee().add(e1);
		d1.getEmployee().add(e2);
		d1.getEmployee().add(e3);
		
		e1.setDepartment(d1);
		e2.setDepartment(d1);
		e3.setDepartment(d1);

Employee e1=new Employee();
		e1.setEmp_name("Madan");
		e1.setAddress("Satara");
		
		
		Employee e2=new Employee();
		e2.setEmp_name("Amit");
		e2.setAddress("Wai");
		
		Employee e3=new Employee();
		e3.setEmp_name("Ravi");
		e3.setAddress("Ambegaon");
		
		Department d1=new Department();
		d1.setDep_name("IT-DEP");
		d1.getEmployee().add(e1);
		d1.getEmployee().add(e2);
		d1.getEmployee().add(e3);
		
		e1.setDepartment(d1);
		e2.setDepartment(d1);
		e3.setDepartment(d1);
		
		
		session.save(d1);
		tr.commit();
		SessionFactory_Util.getSessionFac().close();
		
		
		
		
		
		
	}

}
