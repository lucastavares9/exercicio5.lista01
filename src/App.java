import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digitem a medida em Metros : ");
        double metros = sc.nextDouble();
    
        double centimetros = metros*100;
        sc.close();
        System.out.println( metros + " metros, corresponde a : " + centimetros + " centimetros.");
    }
}
