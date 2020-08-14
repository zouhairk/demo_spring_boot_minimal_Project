package fr.ibformation.demoSpringBoot.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.demoSpringBoot.beans.Personne;
import fr.ibformation.demoSpringBoot.managers.PersonneManager;
 
@RestController
public class DemoControler {
	
	@Autowired
	private PersonneManager personneManager;
	
	@GetMapping("/hello")
	public String hello(@RequestParam("prenom") String prenom) {
		return "hello " + prenom;
	}
	
	
	@GetMapping("/accueil")
	public ModelAndView accueil() {
		ModelAndView mav = new ModelAndView("accueil");
		mav.addObject("message", "Je suis un message du controlleur SPRING");
		mav.addObject("personne", new Personne("test","test")); // initialiser pour le formulaire SPRING
		return mav;
	}
	
	
	@PostMapping("/validerformulaire")
	public ModelAndView recuperFormulaire(@RequestParam("prenom") String prenom, @RequestParam("nom") String nom) {
		System.out.println(prenom + " " + nom);
		return accueil();
	}
	
	@PostMapping("/validerformulairespringMVC")
	public ModelAndView recupererFormulaireSpring(@ModelAttribute("personne") Personne personne) {
		System.out.println(personne);
		personneManager.create(personne);
		System.out.println(personne);
		return accueil();
	}
	
	
	
	
}
