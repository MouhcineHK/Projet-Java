package Reviser;
import java.util.ArrayList;	

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;




public class listeDespersonne {
	ArrayList<Personne> PersonneList =new ArrayList<Personne>();
	
	public void alimenter() {
	    PersonneList.add(new Personne("Mouhcine", 25));
	    PersonneList.add(new Personne("Aymane", 30));
	}
	public void afficherPersonnes() {
	    for (Personne personne : PersonneList) {
	        System.out.println(personne);
	    }
	}
	public void parcourirPersonnes() {
	    Iterator<Personne> it = PersonneList.iterator();
	    while (it.hasNext()) {//verifier si le next existe ou pas 
	        System.out.println(it.next());
	    }
	}
	public void ajouterPersonne(Personne personne) {
	    PersonneList.add(personne);
	}
	
	public Personne recuperePersonne(int index) {
	    if (index >= 0 && index < PersonneList.size()) {
	        return PersonneList.get(index);
	    }
	    throw new IllegalArgumentException("L'indice doit être compris entre 0 et la taille de la liste");
	}
	public boolean supprimerPersonne(Personne personne) {
	    return PersonneList.remove(personne);
	}
	public boolean recherchePersonne(Personne personne) {
	    return PersonneList.contains(personne);
	}
	
	public void trierPersonnes(Comparator<Personne> cmp) {
        Collections.sort(PersonneList, cmp);
    }
	
	public ArrayList<Personne> copierList() {
        ArrayList<Personne> nouvelleListe = new ArrayList<>();
        nouvelleListe.addAll(PersonneList);
        return nouvelleListe;
    }
	public void melangerList() {
        Collections.shuffle(PersonneList);
    }
	public void inverserList() {
        Collections.reverse(PersonneList);
    }
	public ArrayList<Personne> subListe(int start, int end) {
        if (start >= 0 && end < PersonneList.size()) {
            ArrayList<Personne> sousListe = new ArrayList<>(PersonneList.subList(start, end));
            return sousListe;
        }
        throw new IllegalArgumentException("Problème avec start ou end");
    }
	 public boolean comparerListe(ArrayList<Personne> autreListe) {
	        return PersonneList.equals(autreListe);
	    }
	 public void echangerListe(int indice1, int indice2) {
	        Collections.swap(PersonneList, indice1, indice2);
	    }
	 public void viderListe() {
	        PersonneList.clear();
	    }
	 public boolean listeEstVide() {
	        return PersonneList.isEmpty();
	    }
}
