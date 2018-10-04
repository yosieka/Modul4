/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanOverloadingMethod;

/**
 *
 * @author malang
 */
public class TestTugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RenataNilai cv = new RenataNilai();
        System.out.println("Renata nilai 21 dan 13 adalah :" + cv.average(21, 13));
        System.out.println("Renata nilai 19.3 dan 39.5 adalah :" +cv.average(19.3, 39.5));
        System.out.println("Renata nilai 123, 567, 744 :" + cv.average(123, 567, 744));
    }
    
}
