package classes;

public class Main {
    public static void main(String[] args) {
        autoshop c1 = new autoshop();
         
        c1.brand = "Toyota";
        c1.mile = 100;

        autoshop c2 = new autoshop();
        c2.brand = "Honda";
        c2.mile = 1000;


        autoshop c3 = new autoshop();
        c3.brand = "Supra";

        c3.det();
        
    }
    

}
