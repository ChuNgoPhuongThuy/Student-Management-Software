/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author Admin
 */
public class Student {
    private String name;
    private String gender;
    private String birth;
    private String address;
    private String email;
    private String classes;
    private String ID;
   
    public Student() {
    }

    public Student(String ID, String name, String gender, String birth, String address, String email, String classes) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.email = email;
        this.classes = classes;
        this.ID= ID;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID= ID;
    }
    
    
}
