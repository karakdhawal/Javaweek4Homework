package methodoverriding24;

// Final class

// Test class to create objects and call the methods

public class Test2 {

    public static void main (String [] args){

        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest:" + s.getRateofInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateofInterest());
        System.out.println("AXIS Rate of Interest:" + a.getRateofInterest());


    }

}
