import java.util.*;

public class Main {
    public static void main(String[] args) {

        Rettangolo[] Rettangoli = new Rettangolo[2];

        for (int i = 0; i<Rettangoli.length; i++)
        {
            Rettangoli[i] = new Rettangolo();
        }

        Scanner Scan = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i<Rettangoli.length; i++)
        {
            /*System.out.println("Inserisci la base e l'altezza del rettangolo n°"+(i+1)+":\nBase: ");
            
            Rettangoli[i].Base = Scan.nextInt();
    
            System.out.println("Altezza: ");
            Rettangoli[i].Altezza = Scan.nextInt();*/

            Rettangoli[i].Base = r.nextInt(50);

            Rettangoli[i].Altezza = r.nextInt(50);
        }

        Boolean a = true;
        System.out.print("\033[H\033[2J"); System.out.flush(); 
        
        while(a)
        {
            System.out.println("Quale delle seguenti opzioni vuoi eseguire? (Premi il numero corrispondente)\n1) Area\n2) Perimetro\n3) Diagonale\n\nPremi 0 per uscire.");
            int Richiesta = Scan.nextInt();
            System.out.print("\033[H\033[2J"); System.out.flush(); 

            switch(Richiesta)
            {
                case(0):
                {
                    a=false;
                    break;            
                }
                case(1):
                {
                    float SommaAree = 0;
                    for (int i = 0; i<Rettangoli.length; i++)
                    {   
                        SommaAree += Rettangoli[i].Area();        
                    }
                    if (SommaAree > 42)
                    {
                        System.out.println("Henlo\n");
                    }
                    break;
                }
                case(2):
                {
                    for (int i = 0; i<Rettangoli.length; i++)
                    {   
                        Rettangoli[i].Perimetro();        
                    }
                    break;
                }
                case(3):
                {
                    for (int i = 0; i<Rettangoli.length; i++)
                    {   
                        Rettangoli[i].Diagonale();        
                    }
                    break;
                }
            }
        }

        Scan.close();  
    } 
}
