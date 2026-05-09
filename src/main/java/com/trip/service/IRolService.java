package com.trip.service;


import java.util.List;

import com.trips.models.Rol;

public interface IRolService {
	
	List<Rol>buscartodo();
	Rol buscarPorId(Integer IdRol);
}
