package Repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.DateReunion;
import entity.Sondage;
import entity.Utilisateur;
import jpa.EntityManagerHelper;

public class DateReunionRepository {

	static EntityManager manager = EntityManagerHelper.getEntityManager();
	
	public static void remplirTableSondage()
	{
		
		int number = manager.createQuery("Select d From DateReunion d", DateReunion.class).getResultList().size();
		
		if (number == 0) {	
			
			Utilisateur user2=new Utilisateur();
			user2.setNom("user2");
			user2.setPrenom("user2");
			user2.setMail("user2@gmail.com");
			manager.persist(user2);
			
			Sondage s=new Sondage();
			s.setUser(user2);
			s.setDateCreation(new Date());
			s.setLien("lien");
			manager.persist(s);
			
		DateReunion dateReunion = new DateReunion();
		dateReunion.setSondage(s);
		dateReunion.setDate(new Date());
		
		manager.persist(dateReunion);
		
		}
	}
	
	public static List<Sondage> getListeSondage()
	{
		
		Query q=manager.createQuery("select a from Sondage");
		
		return q.getResultList();
	}
}
