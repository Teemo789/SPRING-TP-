package ma.ehei.tp.Dao;

import ma.ehei.tp.Metier.Etudiant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ma.ehei.tp.Metier.Etudiant;

public class MYSQLEtudiantDao implements EtudiantDao {
	 List<Etudiant> etudiants = new ArrayList<>();
	    public void persister(Etudiant etudiant) {
	        etudiants.add(etudiant);
	        System.out.println("Etudiant :"+etudiant.getNom()+" ajouter au base de données !");
	    }

}
