package com.bougatf.ahmed.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Maison {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMaison;
private String villeMaison;
private String adresseMaison;
private Integer nbrChambre;
private Double prixMaison;
private Date dateCreation;



@ManyToOne
private Propriétaire prop;



public Long getIdMaison() {
	return idMaison;
}
public void setIdMaison(Long idMaison) {
	this.idMaison = idMaison;
}
public String getVilleMaison() {
	return villeMaison;
}
public void setVilleMaison(String villeMaison) {
	this.villeMaison = villeMaison;
}
public String getAdresseMaison() {
	return adresseMaison;
}
public void setAdresseMaison(String adresseMaison) {
	this.adresseMaison = adresseMaison;
}
public Integer getNbrChambre() {
	return nbrChambre;
}
public void setNbrChambre(Integer nbrChambre) {
	this.nbrChambre = nbrChambre;
}
public Double getPrixMaison() {
	return prixMaison;
}
public void setPrixMaison(Double prixMaison) {
	this.prixMaison = prixMaison;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public Propriétaire getProp() {
	return prop;
}
public void setProp(Propriétaire prop) {
	this.prop = prop;
}
public Maison(String villeMaison, String adresseMaison, Integer nbrChambre, Double prixMaison, Date dateCreation,
		Propriétaire prop) {
	super();

	this.prop = prop;
}
public Maison() {
	super();
	// TODO Auto-generated constructor stub
}


}

