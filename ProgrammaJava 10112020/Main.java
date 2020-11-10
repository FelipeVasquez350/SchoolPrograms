import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        Rettangolo Pino = new Rettangolo();
        System.out.println("Inserisci la base e l'altezza:\n Base: ");
        Scanner Scan1 = new Scanner(System.in);
        Pino.Base = Scan1.nextInt();

        System.out.println("Altezza: ");
        Scanner Scan2 = new Scanner(System.in);
        Pino.Altezza = Scan2.nextInt();
        
        Boolean a = true;
        System.out.print("\033[H\033[2J"); System.out.flush(); 
        
        while(a)
        {
            System.out.println("Quale delle seguenti opzioni vuoi eseguire? (Premi il numero corrispondente)\n1) Area\n2) Perimetro\n3) Diagonale\n\nPremi 0 per uscire.");
            Scanner Scan3 = new Scanner(System.in);
            int Richiesta = Scan3.nextInt();
            System.out.print("\033[H\033[2J"); System.out.flush(); 

            switch(Richiesta)
            {
                case(0):
                {
                    a=false;
                    Scan3.close();
                    break;            
                }

                case(1):
                {
                    Pino.Area();
                    break;
                }

                case(2):
                {
                    Pino.Perimetro();
                    break;
                }

                case(3):
                {
                    Pino.Diagonale();
                    break;
                }
            }

        }

        Scan1.close();
        Scan2.close();
        
    } 
    
}
