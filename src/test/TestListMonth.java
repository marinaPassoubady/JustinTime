package test;

import java.util.ArrayList;
import java.util.Date;

import metier.User;
import modele.GestionCompte;
import modele.GestionTache;

public class TestListMonth {

	public static void main(String[] args) {
		User u1 = new User(3);
		User u2 = new User(5);
		
		GestionTache t = new GestionTache();
		
		t.partagerTache(3,51, 5);
		
	}

}
