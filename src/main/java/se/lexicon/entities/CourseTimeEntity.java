package se.lexicon.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Stefan Lindh on 9/20/2016.
 */
@Entity
@Table(name = "course_time", schema = "public", catalog = "pagiste")
public class CourseTimeEntity {
    @Id
    @Column(name = "course_time_id")
    private int courseTimeId;

    @Column(name = "course_id")
    private int courseId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "course_date")
    private Timestamp courseDate;


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
