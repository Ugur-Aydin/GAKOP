import java.util.*;

public class gakop {
	

public static void main(String[] args) throws Exception {

	    Scanner kb = new Scanner(System.in);
	    String plt;
	    double wgh;
	    
	    System.out.println("'Gezegenler arasý kütle ölçüm programý'na(GAKOP)hoþgeldiniz.");
	     
	    Thread.sleep(2500);
	     
	     
	    System.out.println("");
	    System.out.println("Ölçüm için bir gezegen seçiniz:");
	    System.out.println("1.Venus   2.Mars    3.Jupiter");
	    System.out.println("4.Saturn  5.Uranus  6.Neptun");
	    System.out.print(">");
	    plt = kb.nextLine();
	     
        if (plt.equalsIgnoreCase("Venüs")) {
        
        System.out.println("Kilo deðerinizi giriniz:");
        Thread.sleep(1000);
        System.out.print(">");
        wgh = kb.nextDouble();
        Thread.sleep(2500);
        System.out.println("Lütfen bekleyiniz...");
        Thread.sleep(2500);
        System.out.println("Venüs'te kilonuz " + (wgh*0.78) + (" kilogram olurdu."));
        
        }

        if (plt.equalsIgnoreCase("Mars")) {
            
        System.out.println("Kilo deðerinizi giriniz:");
        Thread.sleep(1000);
        System.out.print(">");
        wgh = kb.nextDouble();
        Thread.sleep(2500);
        System.out.println("Lütfen bekleyiniz...");
        Thread.sleep(2500);
        System.out.println("Mars'ta kilonuz " + (wgh*0.39) + (" kilogram olurdu."));
        }

        if (plt.equalsIgnoreCase("Jüpiter")) {
            
        System.out.println("Kilo deðerinizi giriniz:");
        Thread.sleep(1000);
        System.out.print(">");
        wgh = kb.nextDouble();
        Thread.sleep(2500);
        System.out.println("Lütfen bekleyiniz...");
        Thread.sleep(2500);
        System.out.println("Jüpiter'de kilonuz " + (wgh*2.65) + (" kilogram olurdu."));
        }
        if (plt.equalsIgnoreCase("Satürn")) {
            
            System.out.println("Kilo deðerinizi giriniz:");
            Thread.sleep(1000);
            System.out.print(">");
            wgh = kb.nextDouble();
            Thread.sleep(2500);
            System.out.println("Lütfen bekleyiniz...");
            Thread.sleep(2500);
            System.out.println("Satürn'de kilonuz " + (wgh*1.17) + (" kilogram olurdu."));
            }

        if (plt.equalsIgnoreCase("Uranüs")) {
            
            System.out.println("Kilo deðerinizi giriniz:");
            Thread.sleep(1000);
            System.out.print(">");
            wgh = kb.nextDouble();
            Thread.sleep(2500);
            System.out.println("Lütfen bekleyiniz...");
            Thread.sleep(2500);
            System.out.println("Uranüs'te kilonuz " + (wgh*1.05) + (" kilogram olurdu."));
            }

          if (plt.equalsIgnoreCase("Neptün")) {
            
            System.out.println("Kilo deðerinizi giriniz:");
            Thread.sleep(1000);
            System.out.print(">");
            wgh = kb.nextDouble();
            Thread.sleep(2500);
            System.out.println("Lütfen bekleyiniz...");
            Thread.sleep(2500);
            System.out.println("Neptün'de kilonuz " + (wgh*1.23) + (" kilogram olurdu."));
            }
          
          kb.close();
          

          
}}   