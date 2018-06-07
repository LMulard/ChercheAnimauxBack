package com.LMulard.zoo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "animaux")
public class Animal {

	private static int count = 0;
	@Id
	@Column(name = "id_animaux")
	private int id;
	@Column
	private String espece;
	@Column
	private String famille;
	@Column
	private String image;
	@Column
	private String regime;
	@Column
	private String lieuDeVie;
	@Column
	private int esperanceVie;

	public Animal(String espece, String famille, String image, String regime, String lieuDeVie, int esperanceVie) {
		super();
		this.id = Animal.count++;
		this.espece = espece;
		this.famille = famille;
		this.image = image;
		this.regime = regime;
		this.lieuDeVie = lieuDeVie;
		this.esperanceVie = esperanceVie;
	}

	public Animal() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}

	public String getLieuDeVie() {
		return lieuDeVie;
	}

	public void setLieuDeVie(String lieuDeVie) {
		this.lieuDeVie = lieuDeVie;
	}

	public int getEsperanceVie() {
		return esperanceVie;
	}

	public void setEsperanceVie(int esperanceVie) {
		this.esperanceVie = esperanceVie;
	}

}
