package com.avijit.alumni.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:৩৭ PM
 * @project NstuAlumni
 */
@Entity
@Table(name = "batch")
public class Batch extends BaseEntity {

    private Long batchNo;

    private String session;

    private String description;

    public Long getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchNo=" + batchNo +
                ", session='" + session + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
