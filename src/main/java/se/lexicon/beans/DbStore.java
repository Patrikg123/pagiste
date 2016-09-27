package se.lexicon.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import se.lexicon.entities.Course;
import se.lexicon.entities.Student;
import se.lexicon.entities.Teacher;
import se.lexicon.entities.Users2;


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

    public Users2 addUser(String username, String password, String emailadress, String firstname, String lastname) {
        Users2 u = new Users2();
        u.setUsername(username);
        u.setPassword(password);
        u.setEmailaddress(emailadress);
        u.setFirstname(firstname);
        u.setLastname(lastname);
        System.out.println(em + ": Adding course " + u);
        em.persist(u);

        em.flush();
        System.out.println(u.getUser_id());
        return u;
    }


    public void addStudent(Users2 u2) {
        Student s = new Student();

        /*
        s.setUsername(u2.getUsername());
        s.setLastname(u2.getLastname());
        s.setFirstname(u2.getFirstname());
        s.setPassword(u2.getPassword());
        s.setEmailaddress((u2.getEmailaddress()));

        */



        s.setUser_id(u2.getUser_id());
        //s.setUsername(u2.getUsername());



        em.persist(s);


    }


    public void addTeacher(Users2 u2) {
        Teacher t = new Teacher();




        t.setUser_id(u2.getUser_id());
        //s.setUsername(u2.getUsername());



        em.persist(t);


    }


    public void removestudent(long studentid){

        Student student = em.find(Student.class, studentid);

        em.remove(student);




    }

    public String NametoFind(long id){

        Users2 u = em.find(Users2.class, id);
        return u.getFirstname();
    }

    public String LastNametoFind(long id){

        Users2 u = em.find(Users2.class, id);
        return u.getLastname();
    }


/* comment to commit */
}