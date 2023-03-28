package com.moto.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moto.service.entidades.Moto;
import com.moto.service.repositorios.MotoRepository;

@Service
public class MotoService {

	@Autowired
	public MotoRepository motoRepository;
	
	public List<Moto> getAll(){
		return motoRepository.findAll();
	}
	
	public Moto getMotoById(Integer id) {
		return motoRepository.findById(id).orElse(null);
	}
	
	public Moto save(Moto moto) {
		Moto nuevoMoto = motoRepository.save(moto);
		return nuevoMoto;
	}
	
	public List<Moto> byUsuarioId(int usuarioId){
		return motoRepository.findByUsuarioId(usuarioId);
	}
}
