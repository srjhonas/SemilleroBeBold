package com.bebold.srjhonas.Semillero.service;

import java.util.List;




import com.bebold.srjhonas.Semillero.model.ServicioXHacedor;




public interface ServicioXHacedorService {
	public List<ServicioXHacedor> getAllServicioXHacedor();
	public ServicioXHacedor CrearServicioXHacedor(ServicioXHacedor servicioXHacedor);
	public void deleteServicioXHacedor(Integer id_servicioXHacedor);
	public List<String> hacedoresAptos(Integer id_tipo_servicio, Integer id_ciudad, Integer precio_esperado);
	
	
}
