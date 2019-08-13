package com.conecta.springej01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conecta.beans.AppConfig;
import com.conecta.beans.AppConfig2;
import com.conecta.beans.Mundo;
import com.conecta.beans.Persona;

public class App {

	public static void main(String[] args) {

//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/conecta/xml/beans.xml");
//		Mundo m = (Mundo) appContext.getBean("mundo");
//		System.out.println(m.getSaludo()); 
//		((ConfigurableApplicationContext)appContext).close();

//		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
//		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//		appContext.register(AppConfig.class);
//		appContext.register(AppConfig2.class);
//		appContext.refresh();
//		Mundo m = (Mundo) appContext.getBean("marte");
//		System.out.println(m.getSaludo());
//		((ConfigurableApplicationContext) appContext).close();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/conecta/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
