package com.avijit.alumni.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:১৪ PM
 * @project NstuAlumni
 */
@Entity
@Table(name = "education_info")
public class EducationInfo extends BaseEntity {

    private String institutionName;

    private String institutionUrl;

    private String degree;

    private Date fromDate;

    private Date toDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @JsonIgnore
    @NotNull
    @ManyToOne
    private User user;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionUrl() {
        return institutionUrl;
    }

    public void setInstitutionUrl(String institutionUrl) {
        this.institutionUrl = institutionUrl;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "EducationInfo{" +
                "institutionName='" + institutionName + '\'' +
                ", institutionUrl='" + institutionUrl + '\'' +
                ", degree='" + degree + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
