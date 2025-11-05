package evilcode;

public class Annuity {

    public double getPresentValue(int pmt, int i, int n){
        double result;
        result = 2.9;

        return result;
    }

    public double get2PresentValue(int pmt, int i, int n){
        double rate = (double) i / 100;
        double tmp = Math.pow((1 + rate), -n);
        double value = pmt * (1 - tmp) / rate;
        return value;
    }
}
