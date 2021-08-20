package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Pelicula;

public interface IPeliculaService {

		public List<Pelicula> listar();

		public Optional<Pelicula> listarId(int id);

		public int save(Pelicula p);

		public void delete(int id);

}
