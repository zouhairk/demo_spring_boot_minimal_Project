package fr.ibformation.demoSpringBoot.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.demoSpringBoot.beans.Personne;
import fr.ibformation.demoSpringBoot.dao.PersonneDAO;

@Service // manager géré par spring
public class PersonneManagerImpl implements PersonneManager {

	@Autowired
	private PersonneDAO personneDAO;
	
	@Override
	public Personne create(Personne personne) {
		return personneDAO.save(personne);
	}

}
