package com.LMulard.zoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMulard.zoo.models.Animal;

public interface IZooRepository extends JpaRepository<Animal, Integer> {

}
