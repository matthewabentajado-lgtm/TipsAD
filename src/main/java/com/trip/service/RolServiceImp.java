package com.trip.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.expression.ParseException;

import com.trips.models.Rol;


public class RolServiceImp implements IRolService {
	
	private static final Rol rol = null;
	List<Rol> lista = null;
	public void RolServiceimp() {
		
		List<Rol> lista = new LinkedList<Rol>();
		
		Rol rol1 = new Rol();
		rol1.setId(1);
		Rol.setNomRol("Administrador del sistema");
		Rol.setDescripcion("El rol de admisnistrador del sistema tiene acceso a todas las funciones  y filtros del sistema, incluyendo la gestion de usuarios, la configuracion del sistema y acceso a los daros de la empresa");
		Rol.setEstado("Activo");
		Rol.setFechacreacion("10-05-2022");
		
		Rol rol2 = new Rol();
		rol2.setId(2);
		Rol.setNomRol("Gerente de ventas");
		Rol.setDescripcion("El rol de gerente de ventas tiene acceso a las funciones y filtros relacionados con la gestion de ventas, incluyendo la creacion de cotizaciones, el seguimiento de clientes y el acceso a los daros de ventas");
		Rol.setEstado("Activo");
		Rol.setFechacreacion("10-05-2022");
		
		Rol rol3 = new Rol();
		rol3.setId(3);
		Rol.setNomRol("gerente de compras");
		Rol.setDescripcion("El rol de gerente de compras tiene acceso a las funciones y filtros relacionados con la gestion de comprar, incluyendo la creacion de ordenes de compra, el segueimiento de proveedores y el acceso a los daros de compraes");
		Rol.setEstado("Activo");
		Rol.setFechacreacion("10-05-2022");
		
		Rol rol4 = new Rol();
		rol4.setId(4);
		Rol.setNomRol("gerente de recuersos humanos");
		Rol.setDescripcion("el rol de gerente de recursos humanos tiene acceso a las funciones y filtros relaciobados con la gestion de recursos humanos, incluyendo la  gestion de empleados y el acceso a los daros de recursos humanos");
		Rol.setEstado("Activo");
		Rol.setFechacreacion("10-05-2022");
		
		lista.add(rol1);
		lista.add(rol2);
		lista.add(rol3);
		lista.add(rol4);
	}
	public List<Rol> buscartodo() {
		// TODO Auto-generated method stub
		return null;
	}
	public Rol buscarPorId(Integer IdRol) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
