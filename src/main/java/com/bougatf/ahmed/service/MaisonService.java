package com.bougatf.ahmed.service;
import java.util.List;

import com.bougatf.ahmed.entities.Maison;
import com.bougatf.ahmed.entities.Propriétaire;




public interface MaisonService {
	
	Maison saveMaison(Maison m);
	Maison updateMaison(Maison m);
	void deleteMaison(Maison m);
	void deleteMaisonById(Long id);
	Maison getMaison(Long id);
	List<Maison> getAllMaisons();
	List<Maison> findByVilleMaison(String Ville);
	List<Maison> findByVilleMaisonContains(String Ville);
	List<Maison> findByVillePrix (String Ville, Double prix);
	List<Maison> findByPropriétaire (Propriétaire Propriétaire);
	List<Maison> findByPropriétaireIdProp(Long id);
	List<Maison> findByOrderByVilleMaisonAsc();
	List<Maison> trierMaisonsVillesPrix();

}