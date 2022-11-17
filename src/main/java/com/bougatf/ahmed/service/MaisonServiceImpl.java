package com.bougatf.ahmed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bougatf.ahmed.entities.Maison;
import com.bougatf.ahmed.entities.Propriétaire;
import com.bougatf.ahmed.repos.MaisonRepository;
@Service
public class MaisonServiceImpl implements MaisonService {
@Autowired
MaisonRepository MaisonRepository;

public Maison saveMaison(Maison p) {
	return MaisonRepository.save(p);
	}
	@Override
	public Maison updateMaison(Maison p) {
	return MaisonRepository.save(p);
	}
	@Override
	public void deleteMaison(Maison p) {
	MaisonRepository.delete(p);
	}
	@Override
	public void deleteMaisonById(Long id) {
	MaisonRepository.deleteById(id);

}
@Override
public Maison getMaison(Long id) {
return MaisonRepository.findById(id).get();
}
@Override
public List<Maison> getAllMaisons() {
return MaisonRepository.findAll();
}
@Override
public List<Maison> findByVilleMaison(String nom) {
return MaisonRepository.findByvilleMaison(nom);
}
@Override
public List<Maison> findByVilleMaisonContains(String nom) {
return MaisonRepository.findByvilleMaison(nom);
}
@Override
public List<Maison> findByVillePrix(String nom, Double prix) {
	
	return MaisonRepository.findByVillePrix(nom, prix);
	}
	@Override
	public List<Maison> findByPropriétaire(Propriétaire Propriétaire) {
	return MaisonRepository.findByPropriétaire(Propriétaire);
	}
	@Override
	public List<Maison> findByPropriétaireIdProp(Long id) {
	return MaisonRepository.findByPropIdProp(id);
	}
	@Override
	public List<Maison> findByOrderByVilleMaisonAsc() {
	return MaisonRepository.findByOrderByVilleMaisonAsc();
	}
	@Override
	public List<Maison> trierMaisonsVillesPrix() {
	return MaisonRepository.trierMaisonVillePrix();}}





