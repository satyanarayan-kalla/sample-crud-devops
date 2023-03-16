package com.bezkoder.spring.datajpa.model;

import javax.persistence.Entity;
import java.util.Date;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "application_user")
public class User implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private long userId;

        @Column(name = "user_allocation_status")
        private String allocStatus;

        @Column(name = "user_email", nullable = false)
        private String email;

        @Column(name = "user_format_id")
        private String formatId;

        @Column(name = "user_name")
        private String userName;

        @Column(name = "user_mobile_no")
        private String phoneNo;

        @Column(name = "user_password")
        private String password;

        @Column(name = "user_role_id")
        private String userRole;

        @Column(name = "user_status")
        private String userStatus;

        @Column(name = "force_change_pwd")
        private Integer forceChangePwd;

        @Column(name = "user_created_at")
        private Date createdAt;

        @Column(name = "ATU_FAILURE_COUNT")
        private int failureCount;


        public int getFailureCount() {
            return failureCount;
        }

        public void setFailureCount(int failurecount) {
            this.failureCount = failurecount;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userid) {
            this.userId = userid;
        }

        public String getAllocStatus() {
            return allocStatus;
        }

        public void setAllocStatus(String allocstatus) {
            this.allocStatus = allocstatus;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFormatId() {
            return formatId;
        }

        public void setFormatId(String formatid) {
            this.formatId = formatid;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String username) {
            this.userName = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserRole() {
            return userRole;
        }

        public void setUserRole(String userRole) {
            this.userRole = userRole;
        }


        public Date getCreatedAt() {
            return createdAt;
        }


        public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }


        public String getUserStatus() {
            return userStatus;
        }


        public void setUserStatus(String userstatus) {
            this.userStatus = userstatus;
        }

        public Integer getForceChangePwd() {
            return forceChangePwd;
        }

        public void setForceChangePwd(Integer forceChangePwd) {
            this.forceChangePwd = forceChangePwd;
        }

        public String getPhoneNo() {
            return phoneNo;
        }


        public void setPhoneNo(String phoneno) {
            this.phoneNo = phoneno;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return email.equals(user.email);
        }



        @Override
        public String toString() {
            return "User{" +
                    "userid=" + userId +
                    ", allocstatus='" + allocStatus + '\'' +
                    ", email='" + email + '\'' +
                    ", formatid='" + formatId + '\'' +
                    ", username='" + userName + '\'' +
                    ", phoneno='" + phoneNo + '\'' +
                    ", password='" + password + '\'' +
                    ", userrole='" + userRole + '\'' +
                    ", userstatus='" + userStatus + '\'' +
                    ", forceChangePwd=" + forceChangePwd +
                    ", createdAt=" + createdAt +
                    ", failurecount=" + failureCount +
                    '}';
        }
    }

