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

public class PointDoc{
        
	public ArrayList<Point> SearchPointOfStudent(String classes, String name, String hocky){
        ArrayList<Point> addpoint =new ArrayList<>();
        Connection connection= ConnectionSQL.getConnection();
        String sql=" SELECT * FROM themhocsinh,nhapdiem WHERE themhocsinh.id = nhapdiem.id and lop = ? and monhoc =? and hocky = ?";
        
        try {
            PreparedStatement preparedStatement=connection.prepareCall(sql);
            preparedStatement.setString(1,classes);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,hocky);
            ResultSet rs=preparedStatement.executeQuery();
            
            while (rs.next()) {
                Point student =new Point(); 
                student.setId(rs.getString("ID"));
                student.setName(rs.getString("Hovaten"));             
                student.setPoint15(rs.getInt("Diem15p"));               
                student.setPoint45(rs.getInt("Diem45p"));        
                student.setAvarage((rs.getInt("Diem45p")) * 0.6 +(rs.getInt("Diem15p"))*0.4);
                addpoint.add(student);                    
            }
              
        } catch (Exception e) {
        }
        return addpoint;
    }
        
    public void updatePoint(Point student) {
    	Connection connection= ConnectionSQL.getConnection();
        String sql="UPDATE nhapdiem SET " + 
         		"Diem15p=?,Diem45p=? WHERE id = ?  ";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setDouble(1, student.getPoint15());
            preparedStatement.setDouble(2, student.getPoint45());
            preparedStatement.setString(3, student.getId());
            int rs=preparedStatement.executeUpdate();
            System.out.println("updated");
         } catch (Exception e) {
        	 e.printStackTrace();
         }
	}
    
   
    
    public static void main(String args[]){
        PointDoc a = new PointDoc();
        Point d = new Point("hu", 3, 4, "hu", "C1_1", 4.5);
        a.updatePoint(d);
        
    }
   
}





