package se.lexicon.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import se.lexicon.entities.Course;
import se.lexicon.entities.Student;
import se.lexicon.entities.Teacher;


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

    public List<Student> Studentlist()

    {
        TypedQuery<Student> query2 =
                em.createQuery("SELECT s from Student s ORDER BY s.student_id", Student.class);
        List<Student> studentlista = query2.getResultList();
        return studentlista;
    }

    public List<Teacher> Teacherlist()

    {
        TypedQuery<Teacher> query3 =
                em.createQuery("SELECT t from Teacher t", Teacher.class);
        List<Teacher> teacherlista = query3.getResultList();
        return teacherlista;
    }

/* comment to commit */
}