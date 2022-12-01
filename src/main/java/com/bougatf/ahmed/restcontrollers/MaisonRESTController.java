package com.bougatf.ahmed.restcontrollers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bougatf.ahmed.entities.Maison;
import com.bougatf.ahmed.service.MaisonService ;
@RestController
@RequestMapping("/api")
@CrossOrigin

public class MaisonRESTController {
@Autowired
MaisonService MaisonService;

@RequestMapping(method = RequestMethod.GET)
public List<Maison> getAllMaisons() {
return MaisonService.getAllMaisons();
}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Maison getMaisonById(@PathVariable("id") Long id) {
return MaisonService.getMaison(id);

}

@RequestMapping(method = RequestMethod.POST)
public Maison createMaison(@RequestBody Maison Maison) {
	
	   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    Maison.setDateCreation(date);
	    Maison.setProp(Maison.getProp());
return MaisonService.saveMaison(Maison);
}

@RequestMapping(method = RequestMethod.PUT)
public Maison updateMaison(@RequestBody Maison Maison) {
return MaisonService.updateMaison(Maison);
}


@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteMaison(@PathVariable("id") Long id)
{
MaisonService.deleteMaisonById(id);
}



@RequestMapping(value="/maisprop/{idProp}",method = RequestMethod.GET)
public List<Maison> getMaisonsByPropId(@PathVariable("idProp") Long idProp) {
return MaisonService.findByPropriétaireIdProp(idProp);
}}