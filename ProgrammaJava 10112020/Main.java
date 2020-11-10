import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        System.out.println("Inserisci la base e l'altezza:\n Base: ");
        Scanner Scan1 = new Scanner(System.in);
        int Base = Scan1.nextInt();


        System.out.println("Altezza: ");
        Scanner Scan2 = new Scanner(System.in);
        int Altezza = Scan2.nextInt();
        
        Scan1.close();
        Scan2.close();

        System.out.println("L'area è: " + Base*Altezza);
        System.out.println("La diagonale è: " + Math.sqrt(Math.pow(Base,2) + Math.pow(Altezza,2)));
        System.out.println("Il perimetro è: " + (Base*2 + Altezza*2));
    } 
    
}
