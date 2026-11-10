package vehiculos;

public class coche extends vehiculo {
    //son los atributos dentro de la clase coche extendido con vehiculo
    private String marca;
    private int caballos;
    public enum Motor {GASOLINA,DISEL,HIBRIDO,ELETRICO};
    private Motor motor;
//constructores completo y vacio
    public coche(String modelo, int numeroPlazas, double precioPorDia, int caballos, String marca, Motor motor) {
        super(modelo, numeroPlazas, precioPorDia);
        this.caballos = caballos;
        this.marca = marca;
        this.motor = motor;
    }

    public coche() {
    }
// con la potencia de caballos en 100
    public coche(String modelo, int numeroPlazas, double precioPorDia, int caballos) {
        super(modelo, numeroPlazas, precioPorDia);
        this.caballos = 100;
    }
    //los getters y setters

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    // devuelver TRUE si tiene mas de 200 caballos en nel motor
    public boolean esPotente(){
        return this.caballos > 200;
    }
    public String toString(){
        return "Coche : " + this.modelo + ", de " + this.marca + " ( " + this.precioPorDia + " €/dia";
    }
}

