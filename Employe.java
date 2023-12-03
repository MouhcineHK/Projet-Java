package Reviser;

import java.util.Objects;

public class Employe extends Personne {
	private double Salaire;

	public Employe(String nom, int age, double Salaire) {
		super(nom, age);
		this.Salaire = Salaire;

	}


	@Override
	public String toString() {
		return "Employe [Salaire=" + Salaire + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Salaire);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;

		if (obj instanceof Employe) {
			Employe other = (Employe) obj;
			return Double.doubleToLongBits(Salaire) == Double.doubleToLongBits(other.Salaire);
		}
		return false;
	}

	public Employe clone() {
		return (Employe) super.clone();
	}

}
