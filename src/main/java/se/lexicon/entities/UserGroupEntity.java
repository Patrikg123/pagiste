package se.lexicon.entities;

import javax.persistence.*;

/**
 * Created by Stefan Lindh on 9/20/2016.
 */

@Entity
@Table(name = "user_group", schema = "public", catalog = "pagiste")
public class UserGroupEntity {

    // ***********************
    // **     Attributes    **
    // ***********************

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_users_group")
    @SequenceGenerator(name="seq_users_group", sequenceName="seq_users_group", allocationSize=1)
    @Column(name = "group_id")
    private int groupId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "group_name")
    private String groupName;

    // ******************************
    // **    Getters & Setters     **
    // ******************************


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroupEntity that = (UserGroupEntity) o;

        if (groupId != that.groupId) return false;
        if (userId != that.userId) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + userId;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        return result;
    }
}
