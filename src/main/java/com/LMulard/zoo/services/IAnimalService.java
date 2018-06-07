package com.LMulard.zoo.services;

import java.util.List;

import com.LMulard.zoo.models.Animal;
import com.LMulard.zoo.repositories.IZooRepository;

public interface IAnimalService {

	Animal getAnimalById(int id);

	List<Animal> deleteById(int id);

	boolean editAnimal(Animal a);

	IZooRepository getiZooRepository();

	void setiZooRepository(IZooRepository iZooRepository);

	List<Animal> getAll();

	Animal addAnimal(Animal a);

}