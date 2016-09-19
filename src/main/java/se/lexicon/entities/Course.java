package se.lexicon.entities;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.util.List;

/**
 * Created by Elev1 on 2016-09-12.
 */
@Entity
public class Course {



/**
 * Created by Elev1 on 2016-08-25.
 *
 */



        @Id
        @SequenceGenerator(name="seq_course",
                sequenceName="seq_course",
                allocationSize=1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator="seq")
        @Column(name = "course_id", updatable=false)
        private long course_id;
        private String coursename;
        private int user_id;
    @ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
    private List<Student> students;


    public Course() {
    }

    public long getId() {
            return course_id;
        }



    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}


