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
public class Point {
    private String name; //tên môn học
    private double point15; //điểm 15p
    private double point45; //điểm 45p
    private String student; // tên học sinh
    private String ID; // mã id
    private double Avarage; // điểm trung bình
    public Point() {
        
    }

    public Point(String name, double point15, double point45,String student,String ID,double Average) {
        this.name = name;
        this.point15 = point15;
        this.point45 = point45;
        this.student = student;
        this.ID = ID;
        this.Avarage = Average;
     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint15() {
        return point15;
    }

    public void setPoint15(double point15) {
        this.point15 = point15;
    }

    public double getPoint45() {
        return point45;
    }

    public void setPoint45(double point45) {
        this.point45 = point45;
    }
    public String getStudent(){
        return student;
    }
    public void setStudent(String student){
        this.student = student;
    }
    public String getId(){
        return ID;
    }
    public void setId(String ID){
        this.ID= ID;
    }
    public double getAvarage(){
        return Avarage;
    }
    public void setAvarage(double Avarage){
        this.Avarage = Avarage;
    }
}
