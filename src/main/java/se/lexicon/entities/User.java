package se.lexicon.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Stefan Lindh on 9/12/2016.
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    // ***********************
    // **     Attributes    **
    // ***********************

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(name = "username", length = 64)
    private String username;

    private String password;
    @Column(name = "emailaddress", length = 64)
    private String emailaddress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_login;

    // ************************
    // **     Constructors   **
    // ************************

    //  public User() {

    //     public User(Long user_id) {
    //          this.user_id = user_id;
    //      }

    //      public User(Long user_id, String username, String password, String emailaddress, ??? last_login) {

    //          this.user_id = user_id;
    //          this.username = username;
    //         this.password = password;
    //         this.emailaddress = emailaddress;
    //        this.last_login = last_login;
 //}

    // ******************************
    // **    Getters & Setters     **
    // ******************************

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {

        this.user_id = user_id;
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

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {

        this.last_login = last_login;
    }

    //   }

}
