import java.util.*;

public class gakop {
	

public static void main(String[] args) throws Exception {

	    Scanner kb = new Scanner(System.in);
	    String plt;
	    double wgh;
	    
	    System.out.println("'Gezegenler aras� k�tle �l��m program�'na(GAKOP)ho�geldiniz.");
	     
	    Thread.sleep(2500);
	     
	     
	    System.out.println("");
	    System.out.println("�l��m i�in bir gezegen se�iniz:");
	    System.out.println("1.Venus   2.Mars    3.Jupiter");
	    System.out.println("4.Saturn  5.Uranus  6.Neptun");
	    System.out.print(">");
	    plt = kb.nextLine();
	     
        if (plt.equalsIgnoreCase("Ven�s")) {
        
        System.out.println("Kilo de�erinizi giriniz:");
        Thread.sleep(1000);
        System.out.print(">");
        wgh = kb.nextDouble();
        Thread.sleep(2500);
        System.out.println("L�tfen bekleyiniz...");
        Thread.sleep(2500);
        System.out.println("Ven�s'te kilonuz " + (wgh*0.78) + (" kilogram olurdu."));
        
        }

        if (plt.equalsIgnoreCase("Mars")) {
            
        System.out.println("Kilo de�erinizi giriniz:");
        Thread.sleep(1000);
        System.out.print(">");
        wgh = kb.nextDouble();
        Thread.sleep(2500);
        System.out.println("L�tfen bekleyiniz...");
        Thread.sleep(2500);
        System.out.println("Mars'ta kilonuz " + (wgh*0.39) + (" kilogram olurdu."));
        }

        if (plt.equalsIgnoreCase("J�piter")) {
            
        System.out.println("Kilo de�erinizi giriniz:");
        Thread.sleep(1000);
        System.out.print(">");
        wgh = kb.nextDouble();
        Thread.sleep(2500);
        System.out.println("L�tfen bekleyiniz...");
        Thread.sleep(2500);
        System.out.println("J�piter'de kilonuz " + (wgh*2.65) + (" kilogram olurdu."));
        }
        if (plt.equalsIgnoreCase("Sat�rn")) {
            
            System.out.println("Kilo de�erinizi giriniz:");
            Thread.sleep(1000);
            System.out.print(">");
            wgh = kb.nextDouble();
            Thread.sleep(2500);
            System.out.println("L�tfen bekleyiniz...");
            Thread.sleep(2500);
            System.out.println("Sat�rn'de kilonuz " + (wgh*1.17) + (" kilogram olurdu."));
            }

        if (plt.equalsIgnoreCase("Uran�s")) {
            
            System.out.println("Kilo de�erinizi giriniz:");
            Thread.sleep(1000);
            System.out.print(">");
            wgh = kb.nextDouble();
            Thread.sleep(2500);
            System.out.println("L�tfen bekleyiniz...");
            Thread.sleep(2500);
            System.out.println("Uran�s'te kilonuz " + (wgh*1.05) + (" kilogram olurdu."));
            }

          if (plt.equalsIgnoreCase("Nept�n")) {
            
            System.out.println("Kilo de�erinizi giriniz:");
            Thread.sleep(1000);
            System.out.print(">");
            wgh = kb.nextDouble();
            Thread.sleep(2500);
            System.out.println("L�tfen bekleyiniz...");
            Thread.sleep(2500);
            System.out.println("Nept�n'de kilonuz " + (wgh*1.23) + (" kilogram olurdu."));
            }
          
          kb.close();
          

          
}}   