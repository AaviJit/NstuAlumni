package com.avijit.alumni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:০৫ PM
 * @project NstuAlumni
 */
@Entity
@Table(name = "contact_info")
public class ContactInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(min = 6)
    private String mobile;

    private String email;

    @Column(columnDefinition = "TEXT")
    private String presentAddress;

    @Column(columnDefinition = "TEXT")
    private String permanentAddress;

    private String fax;

    private String facebookAddress;

    private String linkedInAddress;

    public ContactInfo() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    public String getFacebookAddress() {
        return facebookAddress;
    }

    public void setFacebookAddress(String facebookAddress) {
        this.facebookAddress = facebookAddress;
    }

    public String getLinkedInAddress() {
        return linkedInAddress;
    }

    public void setLinkedInAddress(String linkedInAddress) {
        this.linkedInAddress = linkedInAddress;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", presentAddress='" + presentAddress + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }
}
