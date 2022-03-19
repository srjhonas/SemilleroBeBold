package com.bebold.srjhonas.Semillero.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.bebold.srjhonas.Semillero.model.CiudadXHacedor;


@Repository
public interface CiudadXHacedorRepository extends JpaRepository<CiudadXHacedor, Integer>{

	@Query(value = "select ciudades_x_hacedor.id_ciudadxhacedor as 'id_ciudadxhacedor',\r\n"
			+ "ciudades.nombre_ciudad as 'nombre_ciudad',\r\n"
			+ "ciudades.dpto_ciudad as 'Departamento'\r\n"
			+ "from ciudades_x_hacedor inner join ciudades on ciudades_x_hacedor.id_ciudad = ciudades.id_ciudad\r\n" 
			+ "						inner join hacedores on ciudades_x_hacedor.id_hacedor = hacedores.id_hacedor\r\n"
			+ "where hacedores.id_hacedor = ?", nativeQuery = true)
	List<Object> listadoCiudadesXHacedor(Integer id_hacedor);
	
}
