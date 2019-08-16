package com.conecta.dao;
  
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conecta.beans.Marca;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;

@Repository
public class DaoMarcaImpl implements DAOMarca {

	@Autowired
	private DataSource datasource;

	public void registrar(Marca marca) throws Exception { 
		
		String sql="INSERT INTO marca(id,nombre) values(?,?)";
		Connection con=null;
		try {
			con= datasource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) { 
			System.out.println("Error conexion:" + e.getMessage());
		}finally {
			if(con !=null) {
				con.close();
			}
		}
	}

}
