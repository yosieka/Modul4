
package latihanOverloadingMethod;

public class RenataNilai {
    int x1, x2, x3;
    double y1, y2;
    
    public int average(int x1, int x2){
        return (x1+x2)/2;
    }
    public double average(double y1, double y2){
        return (y1+y2)/2;
    }
    public int average(int x1, int x2, int x3){
        return (x1+x2+x3)/3;
    }
}

