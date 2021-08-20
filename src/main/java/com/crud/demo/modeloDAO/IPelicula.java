package com.crud.demo.modeloDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Pelicula;

@Repository
public interface IPelicula extends CrudRepository<Pelicula, Integer>{

}
