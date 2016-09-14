package se.lexicon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Elev1 on 9/14/2016.
 */

import se.lexicon.entities.User;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

		/* Create EntityManagerFactory */
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("Pagiste-JPA1-punit");

		/* Create and populate Entity */
        User users = new User();
        users.setUser_id(10);
        users.setUsername("Stefan Lindh");
        users.setPassword("password");
        users.setEmailaddress("dr_notes@hotmail.com");
        users.setLast_login(new Date());

		/* Create EntityManager */
        EntityManager em = emf.createEntityManager();

		/* Persist entity */
        em.getTransaction().begin();
        em.persist(users);
        em.getTransaction().commit();

		/* Retrieve entity */
        User user = em.find(User.class, 1);
        System.out.println(users);

		/* Update entity */
        em.getTransaction().begin();
        users.setUsername("S. Lindh");
        System.out.println("Username after updation :- " + users);
        em.getTransaction().commit();

		/* Remove entity */
        em.getTransaction().begin();
        em.remove(users);
        em.getTransaction().commit();

		/* Check whether enittiy is removed or not */
        users = em.find(User.class, 1);
        System.out.println("Employee after removal :- " + users);

    }
}