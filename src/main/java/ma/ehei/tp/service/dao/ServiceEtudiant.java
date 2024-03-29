package ma.ehei.tp.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ma.ehei.tp.Dao.EtudiantDao;
import ma.ehei.tp.Generateur.IdGenerateur;
import ma.ehei.tp.Metier.Etudiant;

@Service("etudiantService")
public class ServiceEtudiant {
	 @Autowired
	    private Etudiant etudiant;

	    @Autowired
	    @Qualifier("memoire")
	    private EtudiantDao etudiantDao;
	    @Autowired
	    @Qualifier("autoIncrement")
	    private IdGenerateur idGenerateur;

	    public void ajouterEtudiant(Etudiant etudiant){
	        etudiant.setId(Integer.parseInt(idGenerateur.generate()));
	        etudiantDao.persister(etudiant);
	        System.out.println("etudiant: "+etudiant.getNom()+" ajouter avec succes");
	    }

	    public void showDetails(){
	        System.out.println("etudiant: "+etudiant.getNom()+" "+etudiant.getPrenom()+" leur id: "+etudiant.getId());
	    }
	}

