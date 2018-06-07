package com.LMulard.zoo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.LMulard.zoo.models.Animal;

public interface IAnimalController {

	List<Animal> getAll();

}