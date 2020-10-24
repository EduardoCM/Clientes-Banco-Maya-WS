package com.bancomaya.clientes;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.Tarjeta;

@WebService
public interface TarjetaServiceWS {
	
	Tarjeta creartarjeta(Tarjeta tarjeta);

	List<Tarjeta> obtenerTarjetas();

	Tarjeta obtenerTarjeta(String numeroTarjeta);

	void eliminarTarjeta(String numeroTarjeta);

	Tarjeta actualizarTarjeta(Tarjeta tarjeta);
	
	void eliminarTodos();

}
