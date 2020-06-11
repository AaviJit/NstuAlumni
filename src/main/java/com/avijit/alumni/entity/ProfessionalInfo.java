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
 * @created_on ১০/৬/২০ at ১১:০৭ PM
 * @project NstuAlumni
 */
@Entity
@Table(name = "professional_info")
public class ProfessionalInfo extends BaseEntity {

    private String companyName;

    private String companyUrl;

    @Column(columnDefinition = "TEXT")
    private String companyAddress;

    private Date statingDate;

    private Date endDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @JsonIgnore
    @NotNull
    @ManyToOne
    private User user;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Date getStatingDate() {
        return statingDate;
    }

    public void setStatingDate(Date statingDate) {
        this.statingDate = statingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        return "ProfessionalInfo{" +
                "companyName='" + companyName + '\'' +
                ", companyUrl='" + companyUrl + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", statingDate=" + statingDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                '}';
    }
}
