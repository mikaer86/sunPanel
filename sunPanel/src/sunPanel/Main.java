package sunPanel;
import java.lang.Math.*;
/**
mik
date: resubmit 2022-03-07
   1. Deklarera och initiera fyra indexlistor med ampere och volt värden. 
   2. Deklarera och initiera nytt objekt för beräkning av laddeffekt (watt230, watt400)
   3. Deklarera och initiera nytt objekt för beräkning  av laddtid (h1, h2)
   4. Bearbeta indexvärden (ampere230 , ampere400) med objekt watt(230, 400) genom att bearbeta (loopa) dem för beräkning av Laddeffekten.
   5. Loopa igenom indexvärden för watt från objekten h1 och h2 för beräkning av laddtid.
   6. skriv ut resultatet konsolfönstret.
 */
public class Main {



  public static void main(String[] args) {

    

    int[] ampere230 = { 10, 16 }; // indexvärden för ampere för tillämpning 230 volt.
    int[] ampere400 = { 10, 16, 32 }; // indexvärden för ampere för tillämpning 400 volt.

    int[] volt230 = { 230, 230 }; // indexvärden för volt för tillämpning 10 och 16 ampere.
    int[] volt400 = { 400, 400, 400 }; // indexvärden för volt för tillämpning 10 , 16 och 32 ampere.

    double[] watt230 = new double[ampere230.length]; // Nytt objekt för 230 ampere beräkning av effekten(W)
    double[] watt400 = new double[ampere400.length]; // Nytt objekt för 400 ampere beräkning av effekten(W)
    double[] h1 = new double[watt230.length]; // Nytt objekt för indexvärden för Watt för beräkning av laddtid
    double[] h2 = new double[watt400.length]; // Nytt objekt för indexvärden för Watt för beräkning av laddtid

    final int dividedBy = 1000;
    
    for (int i = 0; i < ampere230.length; i++) // Loopar igenom indexvärderna för ampere.
    {
      watt230[i] = (double)ampere230[i] * volt230[i] / dividedBy;
      // beräknar laddeffekten

    }

    for (int i = 0; i < ampere400.length; i++) // Loopar igenom indexvärderna för ampere.
    {
      watt400[i] = ampere400[i] * volt400[i] * Math.sqrt(3) / dividedBy;

      // beräknar laddeffekten med kvadratroten

    }

    for (int i = 0; i < watt230.length; i++) { // Loopar igenom indexvärderna för watt.
      double kWh = 35.8;
      h1[i] = kWh / watt230[i];
      // beräknar laddtid
    }

    for (int i = 0; i < watt400.length; i++) { // Loopar igenom indexvärderna för watt.
      double kWh = 35.8;
      h2[i] = kWh / watt400[i];
      // beräknar laddtid
    } 

    System.out.print("Battery 35.8(kWh)");
    System.out.print("\n Current (A): Effect (V): Charging Effect (kW): Charging Time (h): ");
    System.out.print("\n=====================================================================");

    System.out.print("\n" + ampere230[0] + "\t\t\t\t" + volt230[0] + "\t\t\t\t" + Math.round(watt230[0] * 100.00) / 100.00 + "\t\t\t\t" + Math.round(h1[0] * 100.00) / 100.00 + "\t \t \t \t" + "\n");

    System.out.print(+ampere230[1] + "\t \t \t \t" + volt230[1] + "\t \t \t \t" + Math.round(watt230[1] * 100.0) / 100.0 + "\t\t\t\t" + Math.round(h1[1] * 100.00) / 100.00 + "\n");

    System.out.print(+ampere400[0] + "\t \t \t \t" + volt400[0] + "\t \t \t \t" +Math.round(watt400[0] * 100.0) / 100.0 + "\t\t\t" + Math.round(h2[0] * 100.00) / 100.00 + "\n");

    System.out.print(+ampere400[1] + "\t \t \t \t" + volt400[1] + "\t \t \t \t" +Math.round(watt400[1] * 100.0) / 100.0 + "\t\t\t" + Math.round(h2[1] * 100.0) / 100.0 + "\n");

    System.out.print(+ampere400[2] + "\t \t \t \t" + volt400[2] + "\t\t\t\t" +Math.round(watt400[2] * 100.0) / 100.0 + "\t\t\t" + Math.round(h2[2] * 100.0) / 100.0);

  }

}