package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Javabatch;
import com.bean.Pythonbatch;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context =new ClassPathXmlApplicationContext("com/client/Javabatch.xml");
	
	Javabatch jb=context.getBean(Javabatch.class);
	
	Pythonbatch pb=context.getBean(Pythonbatch.class);
	
	jb.batchStatus();
	
	System.out.println(jb.getB_id()+", "+jb.getB_name());
	
	pb.batchstatus();
	
	System.out.println(pb.getB_id()+", "+pb.getB_name());
	}

}
