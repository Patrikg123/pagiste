package se.lexicon.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Stefan Lindh on 9/20/2016.
 */
@Entity
@Table(name = "attended", schema = "public", catalog = "pagiste")
public class AttendedEntity {

    private int attendedId;
    private int courseId;
    private int courseTimeId;
    private int userId;
    private Timestamp lastUpdated;

    @Basic
    @Column(name = "attended_id")
    public int getAttendedId() {
        return attendedId;
    }

    public void setAttendedId(int attendedId) {
        this.attendedId = attendedId;
    }

    @Id
    @Column(name = "course_id")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "course_time_id")
    public int getCourseTimeId() {
        return courseTimeId;
    }

    public void setCourseTimeId(int courseTimeId) {
        this.courseTimeId = courseTimeId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "last_updated")
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttendedEntity that = (AttendedEntity) o;

        if (attendedId != that.attendedId) return false;
        if (courseId != that.courseId) return false;
        if (courseTimeId != that.courseTimeId) return false;
        if (userId != that.userId) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attendedId;
        result = 31 * result + courseId;
        result = 31 * result + courseTimeId;
        result = 31 * result + userId;
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        return result;
    }
}
