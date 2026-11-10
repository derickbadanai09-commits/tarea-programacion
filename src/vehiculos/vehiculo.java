package vehiculos;
public class vehiculo {
    //los atributos dentro de la clase vehiculos, con el modelo en protected por que voy ultilizar em COCHE, y el precioPorDia tambien
    protected String modelo;
    private int numeroPlazas;
    protected double precioPorDia;

// los contrutores completos y vacio
    public vehiculo(String modelo, int numeroPlazas, double precioPorDia) {
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
        this.precioPorDia = precioPorDia;
    }
    public vehiculo() {
    }
    // los getters y setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }
    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    //calculo para devuelver en precio total para um numero de vehiculos y numero de dias
    public double calcularPrecio(double numVehiculos, int dia){
        return numVehiculos * this.precioPorDia;
    }
    public String toString(){
        return " Vehiculo: " + this.modelo + " (" + this.precioPorDia + " €/día)";
    }
}
