package com.bougatf.ahmed.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
@JsonIgnore

@ManyToOne
private Propriétaire prop;

}