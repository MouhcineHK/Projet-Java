package Reviser;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

import git.Documents;



public class GestionPersonne {
	private Personne[] personnes = new Personne[3];
	public GestionPersonne() {
		personnes[0]=new Personne("Mouhcine",21);
		personnes[1]=new Personne("fahd",21);
		personnes[2]=new Employe("yassine",19,2.000); // Ply
		
	}

	public void tierTableau() {
		Arrays.sort(this.personnes);
	}

	public void ajouterPersonne(Personne nouvellePersonne) {
		personnes = Arrays.copyOf(personnes, personnes.length + 1);
		personnes[personnes.length - 1] = nouvellePersonne;
	}

	public boolean SupprimerPersonne(Personne SupprimerPERSONNE) {
		ArrayList<Personne> listePersonnes = new ArrayList<>(Arrays.asList(personnes));
		listePersonnes.remove(SupprimerPERSONNE);
		personnes= listePersonnes.toArray(new Personne[listePersonnes.size()]);
		return true;
	}

	public int compterElement() {
		return personnes.length;
	}
	public void inverserTableau() {
        ArrayList<Personne> listePersonnes = new ArrayList<>(Arrays.asList(personnes));
        Collections.reverse(listePersonnes);
        personnes = listePersonnes.toArray(new Personne[listePersonnes.size()]);
    }
	public void AfficherElements() {
		for(Personne personne : personnes) {
			System.out.println(personne);
		}}
	public Personne personnePlusAge() {
		Arrays.sort(personnes);
		return personnes[personnes.length - 1];
	}
	public boolean testerDeuxTableaux(Personne[] personne1) {
		return Arrays.equals(personnes, personne1);
		
	}
}
