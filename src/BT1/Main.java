/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Khiem
 */
public class Main {
    
    public static void main(String[] args) {
        HoaDonHeader HDH = new HoaDonHeader ("VM01","11/05/2020","Nguyen Trung Khiem");
        CTHD cthd1 = new CTHD("Thit",2,150000,0.5);
        CTHD cthd2 = new CTHD("Cam",2,12000,0.2);
        
        
         HoaDon HD = new HoaDon.Builder()
                 .addCTHD(cthd2)
                 .addCTHD(cthd1)
                 .addHoaDonHeader(HDH)
                 .build();
         
         System.out.println(HD.toString()); 
    }
    
}
