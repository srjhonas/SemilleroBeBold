package com.bebold.srjhonas.Semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bebold.srjhonas.Semillero.model.SolicitudServicio;

@Repository
public interface SolicitudServicioRepository extends JpaRepository<SolicitudServicio, Integer>{
	@Query(value="select SS.id_sol_serv, ES.nombre_estado, SS.direccion_sol_serv, TS.nombre_tipo_servicio,\r\n"
			+ "SS.cliente, H.nombre_hacedor, C.nombre_ciudad, SS.valor_ofrecido, SS.observaciones\r\n"
			+ "from solicitudes_servicio SS inner join estados_solicitud ES on SS.estado_sol_serv = ES.id_estado\r\n"
			+ "							 inner join tipos_servicios TS on SS.tipo_servicio = TS.id_tipo_servicio\r\n"
			+ "							 inner join hacedores H on SS.hacedor = H.id_hacedor\r\n"
			+ "                             inner join ciudades C on SS.ciudad_servicio = C.id_ciudad", nativeQuery = true)
	List<Object> ListadoSolicitudesServ();
	
	@Query(value="select max(id_sol_serv) from solicitudes_servicio", nativeQuery = true)
	Integer numSolicitud();
}
