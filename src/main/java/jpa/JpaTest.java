package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entity.User;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {

		User user1 =new User();
				user1.setNom("Mahjoub");
				user1.setPrenom("Abdel");
				user1.setMail("Abdel@gmail.com");
				manager.persist(user1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
