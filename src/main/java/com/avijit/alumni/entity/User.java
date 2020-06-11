package com.avijit.alumni.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Avijit Barua
 * @created_on ১০/৬/২০ at ১০:৫৫ PM
 * @project NstuAlumni
 */
@Entity
@Table(name = "users")
public class User extends BaseEntity implements UserDetails {

    public static final String SPLIT_CHAR = "::";

    @NotNull
    @Column(unique = true)
    @Size(min = 2, max = 100, message = "Username character must be between 2 to 100!")
    private String username;

    @Size(min = 6)
    @NotNull
    @JsonIgnore
    private String password;

    @JsonIgnore
    private String salt;

    private String mrCode;

    @ManyToOne
    private Role role;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private BasicInfo basicInfo;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private ContactInfo contactInfo;

    @OneToMany(mappedBy = "user")
    private List<ProfessionalInfo> professionalInfos;

    @OneToMany(mappedBy = "user")
    private List<EducationInfo> educationInfos;

    @OneToOne
    private Batch batch;


    @JsonIgnore
    private boolean isDeleted = false;

    // Required for OAuth2
    @JsonIgnore
    private boolean userEnabled = true;
    @JsonIgnore
    private boolean accountNonExpired = true;
    @JsonIgnore
    private boolean accountNoLocked = true;
    @JsonIgnore
    private boolean credentialNonExpired = true;

    public User() {
    }


    public String getUsername() {
        return username;
    }

    public boolean isUserEnabled() {
        return userEnabled;
    }

    public void setUserEnabled(boolean userEnabled) {
        this.userEnabled = userEnabled;
    }

    public boolean isAccountNoLocked() {
        return accountNoLocked;
    }

    public boolean isCredentialNonExpired() {
        return credentialNonExpired;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNoLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialNonExpired;
    }


    @Override
    public boolean isEnabled() {
        return userEnabled;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        GrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
        System.out.println("Authority for " + getUsername() + " -> " + authority.toString());
        authorities.add(authority);
        return authorities;
    }

    @JsonIgnore
    public String getPassword() {
        if (salt == null)
            return password;
        else
            return salt + SPLIT_CHAR + password;

    }

    public void setPassword(String password) {
        this.password = password;
        this.salt = null;
    }

    public String getMrCode() {
        return mrCode;
    }

    public void setMrCode(String mrCode) {
        this.mrCode = mrCode;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<ProfessionalInfo> getProfessionalInfos() {
        return professionalInfos;
    }

    public void setProfessionalInfos(List<ProfessionalInfo> professionalInfos) {
        this.professionalInfos = professionalInfos;
    }

    public List<EducationInfo> getEducationInfos() {
        return educationInfos;
    }

    public void setEducationInfos(List<EducationInfo> educationInfos) {
        this.educationInfos = educationInfos;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", mrCode='" + mrCode + '\'' +
                ", role=" + role +
                ", basicInfo=" + basicInfo +
                ", contactInfo=" + contactInfo +
                ", professionalInfos=" + professionalInfos +
                ", educationInfos=" + educationInfos +
                ", isDeleted=" + isDeleted +
                ", userEnabled=" + userEnabled +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNoLocked=" + accountNoLocked +
                ", credentialNonExpired=" + credentialNonExpired +
                '}';
    }
}
