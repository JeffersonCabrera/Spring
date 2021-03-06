package com.conecta.springej01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conecta.beans.AppConfig;
import com.conecta.beans.AppConfig2;
import com.conecta.beans.Barcelona;
import com.conecta.beans.Ciudad;
import com.conecta.beans.Jugador;
import com.conecta.beans.Mundo;
import com.conecta.beans.Persona;
import com.conecta.interfaces.IEquipo;

public class App {

	/**
	 * @param args
	 */
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
		Jugador ju = (Jugador) appContext.getBean("messi");
		System.out.println(ju.getNombre() + " - " + ju.getEquipo().mostrar());
		
//		IEquipo bar = (IEquipo) appContext.getBean("barcelona");
//		
//		System.out.println(bar.mostrar());
		
//		Ciudad cui =(Ciudad) appContext.getBean("ciudad");
////		Persona per2 = (Persona) appContext.getBean("persona");
//		
//		per.setId(1);
//		per.setNombre("Jefferson");
//		per.setApodo("Jeff");
		
//		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " "+ per.getPais().getNombre());
		
//		String nombreCuidades = "";
//		for(Ciudad ciu: per.getPais().getCiudades()) {
//			nombreCuidades += ciu.getNombre() + "-";
//		}
		
//		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " "+ per.getPais().getNombre() + " " + nombreCuidades);
		
//		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " "+ per.getPais().getNombre() + " " + per.getCiudad().getNombre());
//		System.out.println(per2.getId() + " " + per2.getNombre() + " " + per2.getApodo() + " "+ per2.getPais().getNombre() + " " + per2.getCiudad().getNombre());
//		System.out.println(per);
//		System.out.println(per2);
//		System.out.println(per.getApodo());
//		System.out.println(cui.getNombre());
				
		((ConfigurableApplicationContext) appContext).close();

	}

}
