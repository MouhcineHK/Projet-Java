package Reviser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class tester {

	public static void main(String[] args) {

		GestionPersonne TABPersonnes = new GestionPersonne();
		
		System.out.println("----Afficher le tableau des Personnes-----");
		TABPersonnes.AfficherElements();
		System.out.println("\n");
		
		//Trier tableau
		System.out.println("-----Trier le tableau-----");
		TABPersonnes.tierTableau();
		
		//affichage Après le tri
		System.out.println("-----Affichage Après le tri des personnes -----");
		TABPersonnes.AfficherElements();
		System.out.println("\n");
		
		//Ajoute un nouveau Personne 
		System.out.println("----Ajoute un new Personne-----");
		Personne newPerso = new Personne("fouad",28);
		TABPersonnes.ajouterPersonne(newPerso);
		TABPersonnes.AfficherElements();
		System.out.println("\n");
		
		//Supprimer un personne
        System.out.println("-----Supprimer un Perso-----");
        TABPersonnes.SupprimerPersonne(newPerso);
        
      //Affichage Après la suppression
        System.out.println("-----Affichage apres la suppression------");
        TABPersonnes.AfficherElements();
        System.out.println("\n");
        
     // Compter le nombre de personnes dans le tableau
        System.out.println("-------compte Nombre des comptes-------");
        System.out.println("\nNombre des personnes dans le tableau : " + TABPersonnes.compterElement());
        System.out.println("\n");
      //inverser le tableau
        System.out.println("-----inverser le tableau------");
        TABPersonnes.inverserTableau();
      //affichage Après inversements
        System.out.println("----affichage Apres inversements-----");
        TABPersonnes.AfficherElements();
        System.out.println("\n");
        
        //afficher le personne le plus agé
        System.out.println("------afficher le Perso le plus agé-----");
        System.out.println("le doc le plus grands est "+ TABPersonnes.personnePlusAge()+"\n");
        
        System.out.println("*****************Array list*********************");
        
        listeDespersonne listPer= new listeDespersonne();

      //alimenter la liste par Personnes
        listPer.alimenter();
      //Afficher la liste
        listPer.afficherPersonnes();
    	System.out.println("\n");
    	
    	//Parcourir la liste
    	System.out.println("parcourir la liste");
    	listPer.parcourirPersonnes();
    	System.out.println("\n");
    	//ajouter new personne
    	System.out.print("ajoute new personne");
        Personne NewPerso = new Personne("Hamza",18);
        Personne NewPerso1 = new Personne("hamid",46);
        listPer.ajouterPersonne(NewPerso);
        listPer.ajouterPersonne(NewPerso1);
        
     // Afficher la liste après l'ajout
        System.out.println("Liste après ajout :");
        listPer.afficherPersonnes();
        System.err.println("\n");
        
      //recupere perso par indice
        System.out.println("recupere personne par indice");
        System.out.println("peronne a recupere est "+ listPer.recuperePersonne(1));
      //supprimer perso
        System.out.println("supprimer un perso");
        listPer.supprimerPersonne(NewPerso);
     // Recherche personne dans la liste
        System.out.println("\nRecherche du personne ajouté : " + listPer.recherchePersonne(NewPerso1));
        
      //trier
        listPer.trierPersonnes(Comparator.comparing(Personne::getNom));
        
     // Afficher la liste après le trie
        System.out.println("\nListe Après le tri :");
        listPer.afficherPersonnes();
        System.out.println("\n");
        
      //copier listde Personne
        
        ArrayList<Personne>copielistPer=listPer.copierList();
        System.out.println("Copie de la liste :");
        System.out.println(copielistPer);
        
     // Mélanger la liste
        listPer.melangerList();
        System.out.println("\nListe mélangée avec succes :");
        listPer.afficherPersonnes();
        
     // Inverser la liste
        listPer.inverserList();
        System.out.println("\nListe inversée :");
        listPer.afficherPersonnes();
        
      //obtenir sou list
        System.out.println("\nSous-liste ");
        ArrayList<Personne> souslistPer =listPer.subListe(0,2 );
        System.out.println("\n"+souslistPer);
        
        // Comparer deux listes  
        System.out.println("\nComparer avec la copie de la liste : " + listPer.comparerListe(souslistPer));
        
     // Échanger deux éléments de la liste
        listPer.echangerListe(0, 1);
        System.out.println("\nListe après échange :");
        listPer.afficherPersonnes();
        
     // Vider la liste
        listPer.viderListe();
        System.out.println("La liste est vide : " + listPer.listeEstVide());
        
 
	}
	}


