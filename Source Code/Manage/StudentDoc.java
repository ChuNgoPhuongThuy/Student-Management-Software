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

public class StudentDoc{
        
	public ArrayList<Student> getAllStudent(){
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
                student.setEmail(rs.getString("Email"));
                student.setClasses(rs.getString("Lop"));
                
                students.add(student);                    
            }
        } catch (Exception e) {
        }
        return students;
    }
    
    public void add(Student student){
        Connection connection= ConnectionSQL.getConnection();
       
        
        String sql="INSERT INTO themhocsinh VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            
            preparedStatement.setString(1,student.getID() );
            preparedStatement.setString(2,student.getName() );
            preparedStatement.setString(3,student.getBirth() );
            preparedStatement.setString(4,student.getGender() );
            preparedStatement.setString(5,student.getAddress() );  
            preparedStatement.setString(6, student.getEmail());
            preparedStatement.setString(7,student.getClasses());
            
            int result = preparedStatement.executeUpdate();
            
            
            System.out.println("added");
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    public ArrayList<Student> searchStudent(String id) {
        ArrayList<Student> students = new ArrayList<Student>();
        for(Student student : getAllStudent()){
            if(student.getID().equals(id)){
                students.add(student);
            }
        }
        return students;
    }
    
}


