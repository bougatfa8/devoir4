package com.bougatf.ahmed.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bougatf.ahmed.entities.Maison;
import com.bougatf.ahmed.entities.Propriétaire;


@RepositoryRestResource(path = "rest")
public interface MaisonRepository extends JpaRepository<Maison, Long> {
	List<Maison> findByvilleMaison(String nom);
	List<Maison> findByvilleMaisonContains(String nom);
	
	
	
	@Query("select m from Maison m where m.villeMaison like %:ville and m.prixMaison > :prix")
	List<Maison> findByVillePrix (@Param("ville") String nom,@Param("prix") Double prix);
	
	
	@Query("select m from Maison m where m.prop = ?1")
	List<Maison> findByPropriétaire (Propriétaire prop);
	
	List<Maison> findByPropIdProp(Long id);
	List<Maison> findByOrderByVilleMaisonAsc();
	
	
	@Query("select m from Maison m order by m.villeMaison ASC, m.prixMaison DESC")
	List<Maison> trierMaisonVillePrix ();

}
