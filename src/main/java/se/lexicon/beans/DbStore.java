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
    @PersistenceContext(unitName = "Jonas-JPA1-punit")
    private EntityManager em;

    public void addCourse(String coursename, int studentid) {
        Course c = new Course();
        c.setCoursename(coursename);
        c.setUser_id(studentid);
        System.out.println(em + ": Adding course " + c);
        em.persist(c);
    }
    public Course getCoursename(long id){
        System.out.println("EJB");

        return em.find(Course.class, id);


    }
}