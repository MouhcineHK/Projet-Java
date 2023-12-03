package Reviser;

import java.util.Objects;

public class Personne implements Comparable<Personne>, Cloneable {
	private String nom;
	private int age;
	public Personne(String nom, int age) {
		
		this.nom = nom;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, nom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return age == other.age && Objects.equals(nom, other.nom);
	}
	public Personne clone() {
	    try {
	        return (Personne) super.clone();
	    } catch (CloneNotSupportedException e) {
	        throw new AssertionError(); 
	    }
	}
	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(o.nom);
	}

	

}
