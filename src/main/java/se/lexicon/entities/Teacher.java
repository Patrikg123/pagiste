package se.lexicon.entities;

import javax.persistence.*;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

/**
 * Created by Elev1 on 2016-09-12.
 */
@Entity
@Table(name = "teacher")
@SecondaryTable(name = "users", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id"))
public class Teacher {



    /**
     * Created by Elev1 on 2016-08-25.
     *
     */



    @Id
    @SequenceGenerator(name="teacher_teacer_id_seq",
            sequenceName="teacher_teacer_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="seq")
    @Column(name = "teacher_id", updatable=false)
    private long teacher_id;

    @Column(table="users", name="username")
    private String username;

    @Column(table="users", name="firstname")
    private String firstname;

    @Column(table="users", name="lastname")
    private String lastname;



    //Getters and setters


    public long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(long teacher_id) {
        this.teacher_id = teacher_id;
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
}
