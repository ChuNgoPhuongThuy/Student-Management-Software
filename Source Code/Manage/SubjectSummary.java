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
public class SubjectSummary {
    private String monhoc;
    private String hocky;
    private String lop;
    private int siso;
    public SubjectSummary() {
    }

    public SubjectSummary(String monhoc, String hocky,String lop,int siso) {
        this.monhoc = monhoc;
        this.hocky =hocky;
        this.lop = lop;
        this.siso = siso;
    }

    public String getMonhoc(){
        return monhoc;
    }
    
    public void setMonhoc(){
        this.monhoc = monhoc;
    }
    
    public String getHocky(){
        return hocky;
    }
    
    public void setHocky(){
        this.hocky = hocky;
    }
    public String getLop(){
        return lop;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    public int getSiso(){
        return siso;
    }
    public void  setSiso(int siso){
        this.siso=siso;
    }
}
