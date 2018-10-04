/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanAbstract;

/**
 *
 * @author malang
 */
public class lingkaran extends bangunDatar{
    private double r;
    public lingkaran(double r){
        this.r = r;
    }

    @Override
    public double hitungLuas() {
        return 2*3.14 *r;
    }

    @Override
    public double hitungKeliling() {
        return 3.14 *r*r;
    }
    
}
