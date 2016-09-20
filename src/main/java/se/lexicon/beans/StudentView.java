package se.lexicon.beans;

import se.lexicon.entities.Course;

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
public class StudentView{

    private int id;
    private String question ;   //= LoadQuestion();

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
    public void setQuestion(String question) {
        this.question = question;
    }

    @Inject
    DbStore store;



    public String CreateCourse(){



        String Coursename = this.coursename;
        int userid = this.userid;
        store.addCourse(Coursename, userid);
        return "index.xhtml";

    }

    public List<Student> ListStudents(){
        List<Student> studentlista = store.Studentlist();

        return  studentlista;
    }

    public List<String> ListSTring(){

        List<String> studentlista =new ArrayList<String>();
        return  studentlista;
    }

    public List<Course> ListRegisteredCourses(long id){
        System.out.println(id);
        Student studenttofind = null;
        List<Course> registeredcourses = new ArrayList<Course>();
        // List<Student> studentlista = ListStudents();
        List<Student> studentlista = store.Studentlist();
        for(Student s: studentlista){

            if(s.getStudent_id() == id) {

                studenttofind = s;

            }
            }

            if(studenttofind != null){

                registeredcourses = studenttofind.getCourses();

        }







        return  registeredcourses;
    }
}
