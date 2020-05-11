/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import  java.util.ArrayList;
/**
 *
 * @author Khiem
 */
public class HoaDon {
    HoaDonHeader HDH;
    ArrayList<CTHD> DSHD = new ArrayList<>();
    
    protected  HoaDon (Builder builder)
    {
         this.DSHD = builder.DSHD;
         this.HDH = builder.HDH;
    }

    @Override
    public String toString() {
        String N = HDH.toString();
            for(int i = 0; i<DSHD.size() ; i++)
            {
               N += "\n" + DSHD.get(i).toString();
            }
        return N;
    }
    
    public static class Builder
    {
        HoaDonHeader HDH;
        ArrayList<CTHD> DSHD = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader HDH)
        {
            this.HDH = HDH;
            return this;
        }
        public Builder addCTHD(CTHD DSHD)
        {
            this.DSHD.add(DSHD);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
    
}
