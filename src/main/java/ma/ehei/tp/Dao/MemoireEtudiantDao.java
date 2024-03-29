package ma.ehei.tp.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ma.ehei.tp.Metier.Etudiant;

@Repository
public class MemoireEtudiantDao implements EtudiantDao {
	List<Etudiant> etudiantList = new ArrayList<>();

	@Override
	public void persister(Etudiant etudiant) {
		etudiantList.add(etudiant);
        System.out.println("Etudiant :"+etudiant.getNom()+" persister  avec succes");
	
	}
}