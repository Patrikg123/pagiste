package se.lexicon.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Elev1 on 9/20/2016.
 */
@Entity
@Table(name = "student_course", schema = "public", catalog = "pagiste")
public class StudentCourseEntity {
    @Id
    @Column(name = "student_course_id")
    private int studentCourseId;

    @Column(name = "course_id")
    private int courseId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "status")
    private boolean status;

    @Column(name = "registered_date")
    private Timestamp registeredDate;
    
    @Column(name = "unregistered_date")
    private Timestamp unregisteredDate;


    public int getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(int studentCourseId) {
        this.studentCourseId = studentCourseId;
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


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Timestamp registeredDate) {
        this.registeredDate = registeredDate;
    }


    public Timestamp getUnregisteredDate() {
        return unregisteredDate;
    }

    public void setUnregisteredDate(Timestamp unregisteredDate) {
        this.unregisteredDate = unregisteredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentCourseEntity that = (StudentCourseEntity) o;

        if (studentCourseId != that.studentCourseId) return false;
        if (courseId != that.courseId) return false;
        if (userId != that.userId) return false;
        if (status != that.status) return false;
        if (registeredDate != null ? !registeredDate.equals(that.registeredDate) : that.registeredDate != null)
            return false;
        if (unregisteredDate != null ? !unregisteredDate.equals(that.unregisteredDate) : that.unregisteredDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentCourseId;
        result = 31 * result + courseId;
        result = 31 * result + userId;
        result = 31 * result + (status ? 1 : 0);
        result = 31 * result + (registeredDate != null ? registeredDate.hashCode() : 0);
        result = 31 * result + (unregisteredDate != null ? unregisteredDate.hashCode() : 0);
        return result;
    }
}
