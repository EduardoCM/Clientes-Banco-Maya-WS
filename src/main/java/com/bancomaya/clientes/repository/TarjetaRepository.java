package com.bancomaya.clientes.repository;

import java.util.List;

import com.bancomaya.clientes.model.Tarjeta;

public interface TarjetaRepository {

	Tarjeta creartarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> obtenerTarjetas();
	
	Tarjeta obtenerTarjeta(String numeroTarjeta);
	
	void eliminarTarjeta(String numeroTarjeta);
	
	Tarjeta actualizarTarjeta(Tarjeta tarjeta);
	
	void eliminarTodos();
	
	

}
