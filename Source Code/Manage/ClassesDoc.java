/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author lan
 */

import Control.ConnectionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClassesDoc{
        
	public ArrayList<Student> getAllStudentOfClass(){
        ArrayList<Student> students=new ArrayList<>();
        Connection connection= ConnectionSQL.getConnection();
        String sql="SELECT * FROM themhocsinh";
        
        try {
            PreparedStatement preparedStatement=connection.prepareCall(sql);
            ResultSet rs=preparedStatement.executeQuery();
            
            while (rs.next()) {
                Student student =new Student(); 
                student.setID(rs.getString("ID"));
                student.setName(rs.getString("Hovaten"));             
                student.setGender(rs.getString("gioitinh"));               
                student.setBirth(rs.getString("ngaysinh"));        
                student.setAddress(rs.getString("diachi"));  
                student.setClasses(rs.getString("Lop"));
                student.setEmail(rs.getString("Email"));
                students.add(student);                    
            }
        } catch (Exception e) {
        }
        return students;
    }
    public void deleteStudent(String id) {
    	Connection connection= ConnectionSQL.getConnection();   
         String sql="DELETE FROM themhocsinh WHERE id=?";
         try {
             PreparedStatement preparedStatement=connection.prepareStatement(sql);
             preparedStatement.setString(1,id );
             int rs=preparedStatement.executeUpdate();
             System.out.println("deleted");
         } catch (Exception e) {
        	 e.printStackTrace();
         }
    }
    
    
    public void updateStudent(Student student) {
    	Connection connection= ConnectionSQL.getConnection();
        String sql="UPDATE themhocsinh SET " + 
         		"hovaten=?,gioitinh=?,diachi=?,email=?,ngaysinh=?,lop=? WHERE id = ?  ";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(5,student.getBirth());
            preparedStatement.setString(2,student.getGender());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setString(4,student.getEmail());
            preparedStatement.setString(6, student.getClasses());
            preparedStatement.setString(7, student.getID());
            int rs=preparedStatement.executeUpdate();
            System.out.println("updated");
         } catch (Exception e) {
        	 e.printStackTrace();
         }
	}
    
   
    public ArrayList<Student> searchClass(String classes) {
        ArrayList<Student> StudentOfClass = new ArrayList<Student>();
        for(Student student : getAllStudentOfClass()){
            if(student.getClasses().equals(classes)){
                StudentOfClass.add(student);
            }
        }
        return StudentOfClass;
    }
    
    public static void main(String args[]){
        ClassesDoc a = new ClassesDoc();
        ArrayList<Student> b = a.searchClass("12A1");
        for(Student student : b){
            System.out.println(student.getClasses());
        }
    }

}
    
    
    
    



