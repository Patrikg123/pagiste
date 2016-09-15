package se.lexicon.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



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

    public void addCourse(String coursename, int studentid) {
        Course c = new Course();
        c.setCoursename(coursename);
        c.setUser_id(studentid);
        System.out.println(em + ": Adding course " + c);
        em.persist(c);
    }
    public Course getCoursename(long id){
        System.out.println("EJB");
        System.out.println("EJ");

        return em.find(Course.class, id);


    }
    public List<Course> Courselist()

    {
        TypedQuery<Course> query =
                em.createQuery("SELECT c from Course c", Course.class);
        List<Course> courselista = query.getResultList();
        return courselista;
    }

/* comment to commit */
}