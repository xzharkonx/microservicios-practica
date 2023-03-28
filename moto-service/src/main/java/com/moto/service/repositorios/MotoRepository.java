package com.moto.service.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moto.service.entidades.Moto;

public interface MotoRepository extends JpaRepository<Moto, Integer> {
	
	List<Moto> findByUsuarioId(int usuarioId);

}
