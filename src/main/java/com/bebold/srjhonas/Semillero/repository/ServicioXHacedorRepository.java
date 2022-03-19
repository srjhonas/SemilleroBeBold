package com.bebold.srjhonas.Semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bebold.srjhonas.Semillero.model.ServicioXHacedor;

@Repository
public interface ServicioXHacedorRepository extends JpaRepository<ServicioXHacedor, Integer>{
	
	@Query(value = "select hacedores.id_hacedor as 'ID', \r\n"
			+ "hacedores.nombre_hacedor as 'HACEDOR' \r\n"
			+ "from hacedores inner join servicios_x_hacedor on hacedores.id_hacedor = servicios_x_hacedor.id_hacedor\r\n"
			+ "			   inner join ciudades_x_hacedor on hacedores.id_hacedor = ciudades_x_hacedor.id_hacedor\r\n"
			+ "            inner join tipos_servicios on servicios_x_hacedor.id_tipo_servicio = tipos_servicios.id_tipo_servicio\r\n"
			+ "			   inner join ciudades on ciudades_x_hacedor.id_ciudad = ciudades.id_ciudad	\r\n"
			+ "where tipos_servicios.id_tipo_servicio = ? and ciudades.id_ciudad = ? and servicios_x_hacedor.precio_esperado <= ?", nativeQuery = true)
	List<Object> hacedoresAptos(Integer Ciudad, Integer Servicio, Integer Valor);
	
	@Query(value = "select servicios_x_hacedor.id_servicioxhacedor as 'id',\r\n"
			+ "tipos_servicios.nombre_tipo_servicio as 'Servicio',\r\n"
			+ "servicios_x_hacedor.precio_esperado as 'ValorEsperado'\r\n"
			+ "from servicios_x_hacedor inner join tipos_servicios on servicios_x_hacedor.id_tipo_servicio = tipos_servicios.id_tipo_servicio\r\n"
			+ "						 inner join hacedores on servicios_x_hacedor.id_hacedor = hacedores.id_hacedor\r\n"
			+ "where hacedores.id_hacedor = ?", nativeQuery = true)
	List<Object> listadoServiciosXHacedor (Integer id_hacedor);
	

}
