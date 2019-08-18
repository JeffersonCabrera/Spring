package com.conecta.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conecta.beans.Equipo;
import com.conecta.beans.Jugador;
import com.conecta.beans.Marca;
import com.conecta.service.ServiceJugador;
import com.conecta.service.ServiceMarca;
 
public class App {
	
	public static void main(String[] args) {
		
//		Marca mar = new Marca();
//		mar.setId(2);
//		mar.setNombre("Marca2");

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/conecta/xml/beans.xml");

		ServiceJugador sm = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
//		ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
//		Marca mar3 =(Marca) appContext.getBean("marca3");
//		Equipo eq1 =(Equipo) appContext.getBean("equipo1");
		Jugador jugador= (Jugador)appContext.getBean("jugador1");
		try {
//			sm.registrar(mar);
//			sm.registrar(mar3);
			sm.registrar(jugador);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
