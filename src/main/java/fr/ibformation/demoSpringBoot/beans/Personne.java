package fr.ibformation.demoSpringBoot.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // géré par Hibernate
@Table // change le nom de la table en Base
@Data
@NoArgsConstructor
public class Personne {

 
	@Id // clé primaire
	@GeneratedValue(strategy = GenerationType.AUTO) // auto incrémenté
	private int id;
	@Column(name = "NOM")
	private String nom;
	private String prenom;
	@OneToOne(cascade = CascadeType.ALL)
	private Adresse adresse;
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
	
 
	
}
