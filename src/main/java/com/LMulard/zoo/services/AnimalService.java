package com.LMulard.zoo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LMulard.zoo.models.Animal;
import com.LMulard.zoo.repositories.IZooRepository;

@Service
public class AnimalService implements IAnimalService {

	@Autowired
	IZooRepository iZooRepository;

	// List<Animal> animals;

	public AnimalService() {
		// TODO Auto-generated constructor stub

		/*
		 * this.animals = new ArrayList<>(Arrays.asList( (new Animal("zebre", "Equidés",
		 * "/assets/images/iconeZebre.jpg", "herbivore", "Afrique", 28)), (new
		 * Animal("panda roux", "Ailuridés", "/assets/images/iconePandaRoux.jpg",
		 * "omnivore", "Chine", 15)), (new Animal("lion", "Felides",
		 * "/assets/images/iconeLion.jpg", "carnivore", "Afrique Subsaharienne", 12)),
		 * (new Animal("wombat", "Marsupio", "/assets/images/iconeWombat.jpg",
		 * "herbivore", "Australie", 15)), (new Animal("ours blanc", "Ursidae",
		 * "/assets/images/iconeOursBlanc.jpg", "omnivore", "region Arctique", 30))));
		 */
	}

	@Override
	public IZooRepository getiZooRepository() {
		return iZooRepository;
	}

	@Override
	public void setiZooRepository(IZooRepository iZooRepository) {
		this.iZooRepository = iZooRepository;
	}

	@Override
	public List<Animal> getAll() {
		return this.iZooRepository.findAll();
	}

	@Override
	public Animal getAnimalById(int id) {
		return this.iZooRepository.getOne(id);
	}

	@Override
	public Animal addAnimal(Animal a) {
		return this.iZooRepository.save(a);
	}

	@Override
	public List<Animal> deleteById(int id) {
		this.iZooRepository.deleteById(id);
		return getAll();
		// return this.animals.remove(id);
	}

	@Override
	public boolean editAnimal(Animal a) {
		// boolean b = false;
		// for (Animal temp : animals) {
		// if (a.getId() == temp.getId()) {
		// temp.setEspece(a.getEspece());
		// temp.setFamille(a.getFamille());
		// temp.setEsperanceVie(a.getEsperanceVie());
		// temp.setImage(a.getImage());
		// temp.setLieuDeVie(a.getLieuDeVie());
		// temp.setRegime(a.getRegime());
		//
		// b = true;
		// }
		// }
		// if (b)
		// return true;
		// else {
		// addAnimal(a);
		// return false;
		// }
		return false;
	}

}
