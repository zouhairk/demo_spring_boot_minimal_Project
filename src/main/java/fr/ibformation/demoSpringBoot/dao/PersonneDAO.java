package fr.ibformation.demoSpringBoot.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.demoSpringBoot.beans.Personne;

public interface PersonneDAO extends CrudRepository<Personne, Integer> {

}
