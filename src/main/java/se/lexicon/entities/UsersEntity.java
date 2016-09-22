package se.lexicon.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Stefan Lindh on 9/20/2016.
 * @author Stefan Lindh, Patrik Gustafsson and Gino Molina.
 */

// users - Account info list.

@Entity
@Table(name = "users", schema = "public", catalog = "pagiste")
public class UsersEntity {

    // *************************************
    // ** Set relations to other Entities **
    // *************************************

    @OneToOne
    @JoinColumn(name="user_grop_id")
    private UserGroupEntity userGroupEntity;

    // ***********************
    // **     Attributes    **
    // ***********************

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_users")
    @SequenceGenerator(name="seq_users", sequenceName="seq_users", allocationSize=1)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "emailaddress")
    private String emailaddress;

    @Column(name = "last_login")
    private Timestamp lastLogin;

    // ******************************
    // **    Getters & Setters     **
    // ******************************

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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


    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (userId != that.userId) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (emailaddress != null ? !emailaddress.equals(that.emailaddress) : that.emailaddress != null) return false;
        if (lastLogin != null ? !lastLogin.equals(that.lastLogin) : that.lastLogin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (emailaddress != null ? emailaddress.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        return result;
    }
}
