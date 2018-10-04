/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author malang
 */
public class perempuan extends manusia{
    private double Tbdn;
    private double hitBbi;
    
    public perempuan(double Tbdn){
        this.Tbdn = Tbdn;
    }

    @Override
    public double tinggiBadan() {
        return Tbdn;
    }

    @Override
    public double hitBbi() {
         return (Tbdn-100)-((Tbdn-100)*0.15);
    }
    
    
}
