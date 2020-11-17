public class Rettangolo {

    public int Base;
    public int Altezza;

    public float Area() {
        System.out.println("L'area è: " + Base*Altezza + "\n");
        return Base*Altezza;
    }

    public Double Diagonale() {
        System.out.println("La diagonale è: " + Math.sqrt(Math.pow(Base,2) + Math.pow(Altezza,2)) + "\n");
        return Math.sqrt(Math.pow(Base,2) + Math.pow(Altezza,2));
    }
    
    public float Perimetro() {
        System.out.println("Il perimetro è: " + (Base*2 + Altezza*2) + "\n");
        return (Base*2 + Altezza*2) ;
    }
    
}
