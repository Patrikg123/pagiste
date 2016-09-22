package se.lexicon.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.*;

import se.lexicon.entities.Student;
import se.lexicon.entities.Users2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.util.List;


/**
 * Created by Elev1 on 2016-09-20.
 */

@ManagedBean
//@Named
@SessionScoped
public class UserView {

    private String username;

    private String password;

    private String emailaddress;

    private String firstname;

    private String lastname;

    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DbStore getStore() {
        return store;
    }

    public void setStore(DbStore store) {
        this.store = store;
    }

    @Inject
    DbStore store;

    public String CreateUser(){
        long usrid;






        String username = this.username;
        String password = this.password;
        String emailadress = this.emailaddress;
        String firstname = this.firstname;
        String lastname = this.lastname;
        Users2 u1 = store.addUser(username, password, emailadress, firstname, lastname);
        //System.out.println(usrid);
        String role = this.role;
        if(this.role.equals("Student"))
            store.addStudent(u1);
        return "admin_listcourses.xhtml";

    }
}
