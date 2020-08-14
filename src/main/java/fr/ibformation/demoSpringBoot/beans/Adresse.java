package fr.ibformation.demoSpringBoot.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String numeroRue;
	String libelleVoie;
	
	
}
