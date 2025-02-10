package com.example.Q1.entity;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "`CUST_DETAILS`")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cstId;
    
    @NotBlank(message = "Customer type is required")
    @Size(max = 100, message = "Customer type must not exceed 100 characters")
    @Column(name = "CSTDET_TYPE")
    private String cstDetType;

    @NotBlank(message = "Full name is required")
    @Size(max = 150, message = "Full name must not exceed 150 characters")
    @Column(name = "CSTDET_FULLNAME")
    private String cstDetFullName;
    
    @Column(name = "CSTDET_DOB")
    private Date cstDetDob;
    
    @NotBlank(message="Customer Status is required")
    @Size(max=100, message="Customer status must not exceed 100 characters")
    @Column(name="CSTDET_STATUS")
    private String cstDetStatus;
    
    @NotBlank(message="Contact is required")
    @Size(max=100, message="Contact must not exceed 100 characters")
    @Column(name="CSTDET_CONTACT")
    private String cstDetContact;
    
    @NotBlank(message="Mobile number is required")
    @Size(max=100, message="Mobile number must not exceed 100 characters")
    @Column(name="CSTDET_MOBILE")
    private String cstDetMobile;
    
    @NotBlank(message="Email address is required")
    @Email(message="Invalid email address")
    @Size(max=100, message="Email must not exceed 100 characters")
    @Column(name="CSTDET_EMAIL")
    private String cstDetEmail;
    
    @NotBlank(message="Country is required")
    @Size(max=100, message="Country must not exceed 100 characters")
    @Column(name="CSTDET_COUNTRY")
    private String cstDetCountry;
    
    @Column(name = "CSTDET_EFCTV_DT")
    private Date cstDetEfctvDt;

    @NotBlank(message = "CRUD value is required")
    @Size(max = 1, message = "CRUD value must be a single character")
    @Column(name = "CSTDET_CRUD_VALUE")
    private String cstDetCrudValue;

    @NotBlank(message = "User ID is required")
    @Size(max = 100, message = "User ID must not exceed 100 characters")
    @Column(name = "CSTDET_USER_ID")
    private String cstDetUserId;

    @NotBlank(message = "Workspace ID is required")
    @Size(max = 100, message = "Workspace ID must not exceed 100 characters")
    @Column(name = "CSTDET_WS_ID")
    private String cstDetWsId;

    @NotBlank(message = "Program ID is required")
    @Size(max = 100, message = "Program ID must not exceed 100 characters")
    @Column(name = "CSTDET_PRGM_ID")
    private String cstDetPrgmId;

    @Column(name = "CSTDET_HOST_TS", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date cstDetHostTs;

    @Column(name = "CSTDET_LOCAL_TS", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date cstDetLocalTs;

    @Column(name = "CSTDET_ACPT_TS")
    private Date cstDetAcptTs;

    @Column(name = "CSTDET_ACPT_TS_UTC_OFST")
    private Date cstDetAcptTsUtcOfst;

    @NotBlank(message = "UUID is required")
    @Size(max = 100, message = "UUID must not exceed 100 characters")
    @Column(name = "CSTDET_UUID")
    private String cstDetUuid;
    
    // Getters and setters
    public Long getCstId() {
        return cstId;
    }
    public void setCstId(Long cstId) {
        this.cstId = cstId;
    }
    
    public String getCstDetType() {
        return cstDetType;
    }
    public void setCstDetType(String cstDetType) {
        this.cstDetType = cstDetType;
    }
    
    public String getCstDetFullName() {
        return cstDetFullName;
    }
    public void setCstDetFullName(String cstDetFullName) {
        this.cstDetFullName = cstDetFullName;
    }
    
    public Date getCstDetDob() {
        return cstDetDob;
    }

    public void setCstDetDob(Date cstDetDob) {
        this.cstDetDob = cstDetDob;
    }
    
    public String getCstDetStatus() {
        return cstDetStatus;
    }

    public void setCstDetStatus(String cstDetStatus) {
        this.cstDetStatus = cstDetStatus;
    }

    public String getCstDetContact() {
        return cstDetContact;
    }

    public void setCstDetContact(String cstDetContact) {
        this.cstDetContact = cstDetContact;
    }

    public String getCstDetMobile() {
        return cstDetMobile;
    }

    public void setCstDetMobile(String cstDetMobile) {
        this.cstDetMobile = cstDetMobile;
    }

    public String getCstDetEmail() {
        return cstDetEmail;
    }

    public void setCstDetEmail(String cstDetEmail) {
        this.cstDetEmail = cstDetEmail;
    }

    public String getCstDetCountry() {
        return cstDetCountry;
    }

    public void setCstDetCountry(String cstDetCountry) {
        this.cstDetCountry = cstDetCountry;
    }

    public Date getCstDetEfctvDt() {
        return cstDetEfctvDt;
    }

    public void setCstDetEfctvDt(Date cstDetEfctvDt) {
        this.cstDetEfctvDt = cstDetEfctvDt;
    }

    public String getCstDetCrudValue() {
        return cstDetCrudValue;
    }

    public void setCstDetCrudValue(String cstDetCrudValue) {
        this.cstDetCrudValue = cstDetCrudValue;
    }

    public String getCstDetUserId() {
        return cstDetUserId;
    }

    public void setCstDetUserId(String cstDetUserId) {
        this.cstDetUserId = cstDetUserId;
    }

    public String getCstDetWsId() {
        return cstDetWsId;
    }

    public void setCstDetWsId(String cstDetWsId) {
        this.cstDetWsId = cstDetWsId;
    }

    public String getCstDetPrgmId() {
        return cstDetPrgmId;
    }

    public void setCstDetPrgmId(String cstDetPrgmId) {
        this.cstDetPrgmId = cstDetPrgmId;
    }

    public Date getCstDetHostTs() {
        return cstDetHostTs;
    }

    public void setCstDetHostTs(Date cstDetHostTs) {
        this.cstDetHostTs = cstDetHostTs;
    }

    public Date getCstDetLocalTs() {
        return cstDetLocalTs;
    }

    public void setCstDetLocalTs(Date cstDetLocalTs) {
        this.cstDetLocalTs = cstDetLocalTs;
    }

    public Date getCstDetAcptTs() {
        return cstDetAcptTs;
    }

    public void setCstDetAcptTs(Date cstDetAcptTs) {
        this.cstDetAcptTs = cstDetAcptTs;
    }

    public Date getCstDetAcptTsUtcOfst() {
        return cstDetAcptTsUtcOfst;
    }

    public void setCstDetAcptTsUtcOfst(Date cstDetAcptTsUtcOfst) {
        this.cstDetAcptTsUtcOfst = cstDetAcptTsUtcOfst;
    }

    public String getCstDetUuid() {
        return cstDetUuid;
    }

    public void setCstDetUuid(String cstDetUuid) {
        this.cstDetUuid = cstDetUuid;
    }
    @PrePersist
    public void onPrePersist() {
        if (this.cstDetHostTs == null) {
            this.cstDetHostTs = new Date();
        }
        this.cstDetLocalTs = new Date();
    }

    @PreUpdate
    public void onPreUpdate() {
        this.cstDetLocalTs = new Date();
    }
}