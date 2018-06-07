package com.LMulard.zoo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.LMulard.zoo.models.Animal;
import com.LMulard.zoo.services.IAnimalService;

@CrossOrigin
@RestController
@RequestMapping("/animal")
public class AnimalController implements IAnimalController {

	@Autowired
	IAnimalService animals;

	public AnimalController() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.LMulard.zoo.controllers.IAnimalController#getAll()
	 */
	@Override
	@RequestMapping("/all")
	public List<Animal> getAll() {
		return this.animals.getAll();
	}

	@RequestMapping("/get/{id}")
	public Animal getAnimalById(@PathVariable("id") int id) {
		return this.animals.getAnimalById(id);
	}

	@RequestMapping("/post")
	public Animal addAnimal(@RequestBody Animal a) {
		// System.out.println(a);
		return this.animals.addAnimal(a);
	}

	@RequestMapping("/delete/{id}")
	public List<Animal> deleteAnimal(@PathVariable("id") int id) {
		return this.animals.deleteById(id);
	}

	@RequestMapping(value = "/put", method = { RequestMethod.PATCH })
	public Animal editAnimal(@RequestBody Animal a) { // la methode save de animalService fait un add ou replace
		return this.animals.addAnimal(a);
	}
}
