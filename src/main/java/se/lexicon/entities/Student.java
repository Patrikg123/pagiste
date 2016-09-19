package se.lexicon.entities;

import javax.persistence.*;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.util.List;
import java.util.Set;

/**
 * Created by Elev1 on 2016-09-12.
 */
@Entity
@Table(name = "student")
@SecondaryTable(name = "users", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id"))
public class Student {



    /**
     * Created by Elev1 on 2016-08-25.
     *
     */



    @Id
    @SequenceGenerator(name="student_student_id_seq",
            sequenceName="student_student_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="seq")
    @Column(name = "student_id", updatable=false)
    private long student_id;

    @Column(table="users", name="username")
    private String username;

    @Column(table="users", name="firstname")
    private String firstname;

    @Column(table="users", name="lastname")
    private String lastname;

    @ManyToMany
    @JoinTable(name="student_course",
            joinColumns=
            @JoinColumn(name="student_id", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="course_id", referencedColumnName="id")
    )
   // public List<Course> getCourses() { return courses ; }
    public List<Course> courses;






    //Getters and setters


    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
