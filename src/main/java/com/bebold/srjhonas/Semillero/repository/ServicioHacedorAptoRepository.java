package com.bebold.srjhonas.Semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bebold.srjhonas.Semillero.model.ServicioHacedorApto;

@Repository
public interface ServicioHacedorAptoRepository extends JpaRepository<ServicioHacedorApto, Integer> {
	
	@Query(value="select HA.id_sol_serv, TS.nombre_tipo_servicio, HA.valor_ofrecido, HA.observaciones,\r\n"
			+ "C.nombre_ciudad, ES.nombre_estado, HA.hacedor_apto\r\n"
			+ "from hacedores_aptos HA inner join tipos_servicios TS on HA.tipo_servicio = TS.id_tipo_servicio\r\n"
			+ "						inner join ciudades C on HA.ciudad_servicio = C.id_ciudad\r\n"
			+ "                        inner join estados_solicitud ES on HA.estado_sol_serv = ES.id_estado\r\n"
			+ "where HA.hacedor_apto = ?", nativeQuery = true)
	List<Object> MuroSolicitudes(Integer id_hacedor);
	
}
