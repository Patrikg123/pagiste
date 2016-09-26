
/*

package se.lexicon.entities;

import javax.persistence.*;

/**
 * Created by Elev1 on 9/20/2016.

@Entity
@Table(name = "sequence", schema = "public", catalog = "pagiste")
public class SequenceEntity {
    private String seqName;
    private Long seqCount;

    @Id
    @Column(name = "seq_name")
    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    @Basic
    @Column(name = "seq_count")
    public Long getSeqCount() {
        return seqCount;
    }

    public void setSeqCount(Long seqCount) {
        this.seqCount = seqCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SequenceEntity that = (SequenceEntity) o;

        if (seqName != null ? !seqName.equals(that.seqName) : that.seqName != null) return false;
        if (seqCount != null ? !seqCount.equals(that.seqCount) : that.seqCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = seqName != null ? seqName.hashCode() : 0;
        result = 31 * result + (seqCount != null ? seqCount.hashCode() : 0);
        return result;
    }
}


*/