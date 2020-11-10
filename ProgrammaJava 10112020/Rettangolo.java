public class Rettangolo {

    public int Base;
    public int Altezza;

    public void Area() {
        System.out.println("L'area è: " + Base*Altezza + "\n");
    }

    public void Perimetro() {
        System.out.println("La diagonale è: " + Math.sqrt(Math.pow(Base,2) + Math.pow(Altezza,2)) + "\n");
    }
    
    public void Diagonale() {
        System.out.println("Il perimetro è: " + (Base*2 + Altezza*2) + "\n");
    }
    
}
