package com.conecta.spring02;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conecta.beans.Barcelona;
import com.conecta.beans.Jugador;
import com.conecta.beans.Juventus;

public class App {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elija un equipo: 1-Barcelona 2-Juventus");
		
		int respuesta = sc.nextInt();
		 
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/conecta/xml/beans.xml");
		Jugador ju =(Jugador) appContext.getBean("jugador1");
		
		switch (respuesta) {
		case 1:
			ju.setEquipo(new Barcelona());
			break;
		case 2:
			ju.setEquipo(new Juventus());
			break;

		default:
			break;
		}
		
		System.out.println(ju.getNombre() + " - " + ju.getEquipo().mostrar() + " - " + ju.getCamiseta().getNumero() + " - " + ju.getCamiseta().getMarca().getNombre());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
