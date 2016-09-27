package se.lexicon.beans;

import se.lexicon.entities.Teacher;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import se.lexicon.entities.Course;
import se.lexicon.entities.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;





import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;


@ManagedBean
//@Named
@SessionScoped
public class Teacherview{

    private int id;


    private String coursename = "Japanese";
    private int userid = 2;


    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getH(){
        return "www";
    }
    /* public String getQuestion() {
         question =  store.getCoursename(this.counter).getCoursename();
         System.out.println("bean");
         return question;
    }
  */


    @Inject
    DbStore store;




    public List<Teacher> Listteachers(){
        List<Teacher> teacherlista = store.Teacherlist();

        return  teacherlista;
    }










    public void deleteStudent(long studentid){

        store.removestudent(studentid);


    }


}
