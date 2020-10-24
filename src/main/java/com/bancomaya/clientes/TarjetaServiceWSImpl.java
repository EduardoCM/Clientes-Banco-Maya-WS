package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.Tarjeta;
import com.bancomaya.clientes.service.TarjetaService;
import com.bancomaya.clientes.service.TarjetaServiceImpl;


@WebService(endpointInterface = "com.bancomaya.clientes.TarjetaServiceWS")
public class TarjetaServiceWSImpl implements TarjetaServiceWS {

	private TarjetaService tarjetaService = new TarjetaServiceImpl();
	
	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		return tarjetaService.creartarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return tarjetaService.obtenerTarjetas();
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		return tarjetaService.obtenerTarjeta(numeroTarjeta);
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		tarjetaService.eliminarTarjeta(numeroTarjeta);
	}

	@Override
	public Tarjeta actualizarTarjeta(Tarjeta tarjeta) {
		return tarjetaService.actualizarTarjeta(tarjeta);
	}

	@Override
	public void eliminarTodos() {
		tarjetaService.eliminarTodos();
	}
	

	

}
