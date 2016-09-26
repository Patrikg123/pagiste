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
//@SecondaryTable(name = "users2", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id"))
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
   // private String username;

    /*

    @Column(table="users2", name="username")
    private String username;

    @Column(table="users2", name="firstname")
    private String firstname;

    @Column(table="users2", name="lastname")
    private String lastname;

    @Column(table="users2", name="password")
    private String password;

    @Column(table="users2", name="emailaddress")
    private String emailaddress;

    */




    private  long user_id;

    @ManyToMany
    @JoinTable(name="student_course",
            joinColumns=
            @JoinColumn(name="student_id", referencedColumnName="student_id"),
            inverseJoinColumns=
            @JoinColumn(name="course_id", referencedColumnName="course_id")
    )


    // public List<Course> getCourses() { return courses ; }
    public List<Course> courses;





    //Getters and setters

/*
    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
*/
    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }
/*
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

/*

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
*/
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;

    }

    /*

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    */
}
