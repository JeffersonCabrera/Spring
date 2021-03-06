package com.conecta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conecta.beans.Marca;
import com.conecta.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca {

	@Autowired
	private DAOMarca daoMarca;

	public void registrar(Marca marca) throws Exception {

		try {
			daoMarca.registrar(marca);
		} catch (Exception e) {
			throw e;
		}
	}

}
