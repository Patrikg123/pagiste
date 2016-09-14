package se.lexicon.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Elev1 on 2016-08-25.
 */


import se.lexicon.entities.Course;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class DbStore {
    @PersistenceContext(unitName = "Pagiste-JPA1-punit")
    private EntityManager em;

    public void addCourse(Course c) {
        System.out.println(em + ": Adding question " + c);
   //     em.persist(c);
    }
    public Course getCoursename(long id){
        System.out.println("EJB");

        return em.find(Course.class, id);


    }
}