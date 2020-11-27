class BMI extends Persona{

    public float BMI;

    public BMI(float Peso, float Altezza) {
        super(Peso, Altezza);
    }

    public float getBMI() {
        return this.BMI;
    }
    
    public void setBMI(float Peso, float Altezza) {
        this.BMI = Peso/(Altezza*Altezza);
    }
}

public class Persona{

    public float Peso = 0;
    public float Altezza = 0;

    public Persona(float Peso, float Altezza) {
        this.Peso = Peso;
        this.Altezza = Altezza;
    }

    public float getPeso() {
        return this.Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltezza() {
        return this.Altezza;
    }

    public void setAltezza(float Altezza) {
        this.Altezza = Altezza;
    }
}
