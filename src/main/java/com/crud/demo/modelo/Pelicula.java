package com.crud.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmovie;
	private String namemovie;
	private String descriptionmovie;
	private int categorymovie;
	private String imgmovie = "http;localhost/img/blo.jpg";
	
	public Pelicula() {
		
	}
	public Pelicula(int idmovie, String namemovie, String descriptionmovie, int categorymovie, String imgmovie) {
		super();
		this.idmovie = idmovie;
		this.namemovie = namemovie;
		this.descriptionmovie = descriptionmovie;
		this.categorymovie = categorymovie;
		this.imgmovie = imgmovie;
	}
	public int getIdmovie() {
		return idmovie;
	}
	public void setIdmovie(int idmovie) {
		this.idmovie = idmovie;
	}
	public String getNamemovie() {
		return namemovie;
	}
	public void setNamemovie(String namemovie) {
		this.namemovie = namemovie;
	}
	public String getDescriptionmovie() {
		return descriptionmovie;
	}
	public void setDescriptionmovie(String descriptionmovie) {
		this.descriptionmovie = descriptionmovie;
	}
	public int getCategorymovie() {
		return categorymovie;
	}
	public void setCategorymovie(int categorymovie) {
		this.categorymovie = categorymovie;
	}
	public String getImgmovie() {
		return imgmovie;
	}
	public void setImgmovie(String imgmovie) {
		this.imgmovie = imgmovie;
	}
	
	

}
