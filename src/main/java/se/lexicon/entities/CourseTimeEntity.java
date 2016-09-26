/*

package se.lexicon.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Stefan Lindh on 9/20/2016.
 * @author Stefan Lindh, Patrik Gustafsson and Gino Molina.


// course_time - the scheduled lession times.

@Entity
@Table(name = "course_time", schema = "public", catalog = "pagiste")
public class CourseTimeEntity {

    // *************************************
    // ** Set relations to other Entities **
    // *************************************

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity getCourseEntity;

    @OneToOne(mappedBy = "course_time")
    private AttendedEntity attendedEntity;

    @OneToOne(mappedBy = "course_time")
    private StudentCourseEntity studentCourseEntity;

    // ***********************
    // **     Attributes    **
    // ***********************

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_course_time")
    @SequenceGenerator(name="seq_course_time", sequenceName="seq_course_time", allocationSize=1)
    @Column(name = "course_time_id")
    private int courseTimeId;

    @Column(name = "course_id")
    private int courseId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "course_date")
    private Timestamp courseDate;


    // ******************************
    // **    Getters & Setters     **
    // ******************************

    public int getCourseTimeId() {
        return courseTimeId;
    }

    public void setCourseTimeId(int courseTimeId) {
        this.courseTimeId = courseTimeId;
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public Timestamp getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Timestamp courseDate) {
        this.courseDate = courseDate;
    }

    // ******************************
    // **     EQUALS & HASH        **
    // ******************************

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseTimeEntity that = (CourseTimeEntity) o;

        if (courseTimeId != that.courseTimeId) return false;
        if (courseId != that.courseId) return false;
        if (userId != that.userId) return false;
        if (courseDate != null ? !courseDate.equals(that.courseDate) : that.courseDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseTimeId;
        result = 31 * result + courseId;
        result = 31 * result + userId;
        result = 31 * result + (courseDate != null ? courseDate.hashCode() : 0);
        return result;
    }
}

*/