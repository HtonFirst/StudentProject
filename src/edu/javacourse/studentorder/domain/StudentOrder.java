package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class StudentOrder {

    private long studentId;
    private String MarriageCertifiacated;
    private LocalDate MarriageDate;
    private String MarriageOffice;
    private Adult husband;
    private Adult wife;
    private Child child;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getMarriageCertifiacated() {
        return MarriageCertifiacated;
    }

    public void setMarriageCertifiacated(String marriageCertifiacated) {
        MarriageCertifiacated = marriageCertifiacated;
    }

    public LocalDate getMarriageDate() {
        return MarriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        MarriageDate = marriageDate;
    }

    public String getMarriageOffice() {
        return MarriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        MarriageOffice = marriageOffice;
    }
}
