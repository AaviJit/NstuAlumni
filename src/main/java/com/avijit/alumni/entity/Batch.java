package com.avijit.alumni.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

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

    @OneToMany
    @JsonIgnore
    private List<User> users;

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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
