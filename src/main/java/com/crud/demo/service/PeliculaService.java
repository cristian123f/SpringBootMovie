package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.modelo.Pelicula;
import com.crud.demo.modeloDAO.IPelicula;
import com.crud.demo.serviceInterface.IPeliculaService;

@Service
public class PeliculaService implements IPeliculaService{

	@Autowired
	private IPelicula dao;
	
	@Override
	public List<Pelicula> listar() {		
		return (List<Pelicula>) dao.findAll();
	}

	@Override
	public Optional<Pelicula> listarId(int id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Pelicula p) {
		int res=0;
		Pelicula pel=dao.save(p);
		if(!pel.equals(null)) {
			res=1;
		}
		return res;

	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}
}
