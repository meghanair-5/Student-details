package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {


    @Id
    private String _id;
    private String studentName;
    private String dob;
    private String className;
    private String division;
    private String gender;

    private String admissionNumber;



    public Student(String _id, String studentName, String dob, String className, String division, String gender, String admissionNumber) {
        this._id = _id;
        this.studentName = studentName;
        this.dob = dob;
        this.className = className;
        this.division = division;
        this.gender = gender;
        this.admissionNumber = admissionNumber;
    }



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }



    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", dob='" + dob + '\'' +
                ", className='" + className + '\'' +
                ", division='" + division + '\'' +
                ", gender='" + gender + '\'' +
                ", admissionNumber'" + admissionNumber +'\'' +
                '}';
    }

}
