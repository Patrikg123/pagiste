package se.lexicon.beans;

import se.lexicon.entities.Course;
import se.lexicon.entities.Teacher;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;





        import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;


@ManagedBean
//@Named
@SessionScoped
public class DbTestBean {

    private int id;
    private String question ;   //= LoadQuestion();
    private long counter = 1;
    private String coursename = "Japanese";
    private int userid = 2;
    private String firsname = "pg";
    private int teacher_id = 1;

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

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
    public String getQuestion() {
        question =  store.getCoursename(this.counter).getCoursename();
        System.out.println("bean");
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Inject
    DbStore store;

    public String LoadQuestion(){
        this.counter = this.counter + 1;
        return  "index.xhtml";


        //System.out.println("bean");
//String s = store.getQuestions(1).getQuestion();
        //    return s;
        //     return store.getQuestions(1).getQuestion();
        //    return "HEJ";
    }

    public String CreateCourse(){



        String Coursename = this.coursename;
        int userid = this.teacher_id;
        store.addCourse(Coursename, userid);
        return "admin_listcourses.xhtml";

    }

    public List<Course> ListCourses(){
        List<Course> courselista = store.Courselist();
        return  courselista;
    }

    public List<Teacher> ListTeachers(){
        List<Teacher> teacherlista = store.Teacherlist();
        return  teacherlista;
    }


}
