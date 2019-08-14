package com.conecta.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.conecta.interfaces.IEquipo;

@Service
public class Barcelona implements IEquipo {

	public String mostrar() { 
		return "Barcelona FC";
	}

}
