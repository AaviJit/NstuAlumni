package com.avijit.alumni.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১১:০০ PM
 * @project NstuAlumni
 */
@Entity
@Table(name = "basic_info")
public class BasicInfo extends BaseEntity {

    @NotNull
    @Column(columnDefinition = "TEXT")
    @Size(min = 2, max = 100, message = "First name character must be between 2 to 100!")
    private String firstName;

    private String middleName;

    @NotNull
    @Column(columnDefinition = "TEXT")
    @Size(min = 2, max = 100, message = "First name character must be between 2 to 100!")
    private String lastName;

    private Date dob;

    private String gender;

    private String bloodGroup;

    private String religion;

    @ManyToOne
    private User createdBy;

    /*@OneToOne
    private Image profilePicture;*/

//    @Column(length = 10000000)
//    @Basic(fetch = FetchType.LAZY, optional = true)
//    private byte[] profilePicture;

    public BasicInfo() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    /*public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }*/

        /*public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }*/

    @Override
    public String toString() {
        return "BasicInfo{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", religion='" + religion + '\'' +
                ", createdBy=" + createdBy +
                /* ", profilePicture=" + profilePicture +*/
                '}';
    }
}
