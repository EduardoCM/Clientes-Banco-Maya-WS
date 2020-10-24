package com.bancomaya.clientes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bancomaya.clientes.model.Tarjeta;
import com.bancomaya.clientes.repository.TarjetaRepository;
import com.bancomaya.clientes.repository.TarjetaRepositoryImpl;



@Service
public class TarjetaServiceImpl implements TarjetaService {
	
	private TarjetaRepository repository = new TarjetaRepositoryImpl();

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		return repository.creartarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return repository.obtenerTarjetas();
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		return repository.obtenerTarjeta(numeroTarjeta);
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		repository.eliminarTarjeta(numeroTarjeta);
	}

	@Override
	public Tarjeta actualizarTarjeta(Tarjeta tarjeta) {
		return repository.actualizarTarjeta(tarjeta);
	}

	@Override
	public void eliminarTodos() {
		repository.eliminarTodos();
		
	}

}
