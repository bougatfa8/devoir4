package com.bougatf.ahmed.entities;

import org.springframework.data.rest.core.config.Projection;


@Projection(name="villeMais", types= {Maison.class})
public interface MaisonProjection {
public String getVilleMaison();
}
