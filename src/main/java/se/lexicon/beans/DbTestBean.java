package se.lexicon.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 * Created by Elev1 on 2016-09-13.
 */



        import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 * Created by Elev1 on 2016-08-25.
 */
@ManagedBean
//@Named
@SessionScoped
public class DbTestBean {

    private int id;
    private String question ;;   //= LoadQuestion();
    private long counter = 1;



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



        String Coursename = "Philosophy";
        int userid = 2;
        store.addCourse(Coursename, userid);
        return "index.xhtml";

    }


}
