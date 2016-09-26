/*

package se.lexicon.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Stefan Lindh on 9/20/2016.
 * @author Stefan Lindh, Patrik Gustafsson and Gino Molina.


// course is a list of the courses.

@Entity
@Table(name = "course", schema = "public", catalog = "pagiste")
public class CourseEntity {

    // *************************************
    // ** Set relations to other Entities **
    // *************************************

    @OneToMany(mappedBy="CourseEntity")
    private Set<CourseTimeEntity> courseTimeEntitySet;

    // ***********************
    // **     Attributes    **
    // ***********************

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_course")
    @SequenceGenerator(name="seq_course", sequenceName="seq_course", allocationSize=1)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "coursename")
    private String coursename;

    @Column(name = "user_id")
    private int userId;

    // ******************************
    // **    Getters & Setters     **
    // ******************************

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public Set<CourseTimeEntity> getCourseTimeEntitySet()
    {
        return courseTimeEntitySet;
    }
    public void setCourseTimeEntitySet(Set<CourseTimeEntity> courseTimeEntitySet)
    {
        this.courseTimeEntitySet = courseTimeEntitySet;
    }


    // ******************************
    // **     EQUALS & HASH        **
    // ******************************

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (courseId != that.courseId) return false;
        if (userId != that.userId) return false;
        if (coursename != null ? !coursename.equals(that.coursename) : that.coursename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + (coursename != null ? coursename.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }
}

*/