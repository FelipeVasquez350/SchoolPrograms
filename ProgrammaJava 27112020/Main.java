import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in); 
        System.out.println("Salve, per il calcolo del BMI inserisca Peso corporeo e altezza:\nPeso: ");
        float Peso = Scan.nextFloat();
        System.out.println("Altezza: ");
        float Altezza = Scan.nextFloat();
        BMI Gino = new BMI(Peso, Altezza);
        Gino.setBMI(Gino.getPeso(), Gino.getAltezza());
        System.out.println("Il tuo Indice di Massa Corporea è: " + Gino.getBMI());
        Scan.close();
    }
}