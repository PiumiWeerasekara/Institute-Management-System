/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.core.dto;

/**
 *
 * @author DEll
 */
public class StudentDTO extends SuperDTO{

    private String studentID;
    private String registrationID;
    private String frstName;
    private String lastName;
    private String dob;
    private String phone;
    private String address;
    private String nic;
    private String school;

    public StudentDTO() {
    }

    public StudentDTO(String studentID, String registrationID, String frstName, String lastName, String dob, String phone, String address, String nic, String school) {
        this.studentID = studentID;
        this.registrationID = registrationID;
        this.frstName = frstName;
        this.lastName = lastName;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.nic = nic;
        this.school = school;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the registrationID
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * @param registrationID the registrationID to set
     */
    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    /**
     * @return the frstName
     */
    public String getFrstName() {
        return frstName;
    }

    /**
     * @param frstName the frstName to set
     */
    public void setFrstName(String frstName) {
        this.frstName = frstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

     @Override
    public String toString() {
        return "StudentDTO{" + "studentID=" + studentID + ", registrationID=" + registrationID + ", frstName=" + frstName + ", lastName=" + lastName + ", dob=" + dob + ", phone=" + phone + ", address=" + address + ", nic=" + nic + ", school=" + school + '}';
    }
}

    

   