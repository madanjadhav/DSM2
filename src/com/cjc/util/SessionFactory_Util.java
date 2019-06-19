package com.cjc.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.cjc.model.Department;
import com.cjc.model.Employee;

public class SessionFactory_Util {
	
	public static SessionFactory sf=null;
	
	public static SessionFactory getSessionFac() {
		
		if(sf==null) {
			
			Map<String, String> setting=new HashMap<>();
			
			setting.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			setting.put(Environment.URL, "jdbc:mysql://localhost:3306/OnetoMant_Bidirectional");
			setting.put(Environment.USER, "root");
			setting.put(Environment.PASS, "root");
			setting.put(Environment.HBM2DDL_AUTO, "update");
			setting.put(Environment.SHOW_SQL, "true");
			setting.put(Environment.FORMAT_SQL, "true");
			
			StandardServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(setting).build();
			MetadataSources mds=new MetadataSources(sr);
			mds.addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
			Metadata md=mds.getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
			return sf;
		}
		return sf;
		
	}

}
