/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanInterface;

/**
 *
 * @author malang
 */
public class InterfaceSegitiga implements InterfaceBangunDatar{
    private double alas;
    private double tingi;
    
    public InterfaceSegitiga(double alas, double tinggi){
        this.alas = alas;
        this.tingi = tinggi;
        
    }

    @Override
    public double hitungLuas() {
    return((alas*tingi)/2);
    }

    @Override
    public double hitungKeliling() {
    return 2 *alas + tingi;
    }
}
