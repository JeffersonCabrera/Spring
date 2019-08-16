package com.conecta.spring04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conecta.beans.Barcelona;
import com.conecta.beans.Camiseta;
import com.conecta.beans.Jugador;
import com.conecta.beans.Juventus;
import com.conecta.beans.Marca;

@Configuration
public class AppConfig {

	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Barcelona barcelona1() {
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
