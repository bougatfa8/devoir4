package com.bougatf.ahmed.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bougatf.ahmed.entities.Propriétaire;
import com.bougatf.ahmed.repos.PropRepository;

@RestController
@RequestMapping("/api/prop")
@CrossOrigin("*")
public class PropRESTController {
	
	@Autowired
	PropRepository propRepository;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Propriétaire> getAllCategories()
	{
			return propRepository.findAll();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Propriétaire getCategorieById(@PathVariable("id") Long id) {
		return propRepository.findById(id).get();
	}

}
