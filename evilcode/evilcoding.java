package evilcode;

public class evilcoding {
    
    public static void main(String[] args){

        Annuity a = new Annuity();
        double PV = a.getPresentValue(2, 8, 7);
        double CORRECTPV = a.get2PresentValue(2, 8, 7);

        System.out.println(PV);
        System.out.println(CORRECTPV);
    }
}
