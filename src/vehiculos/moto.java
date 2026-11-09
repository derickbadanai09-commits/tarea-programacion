package vehiculos;

//extends para mostrar que la moto esta extendida con vehiculo
public class moto extends vehiculo{
    // los atributos
    private String fabricante;
    private Integer cilindrada;

//constructores completo e vacio
    public moto(String modelo, int numeroPlazas, double precioPorDia, Integer cilindrada, String fabricante) {
        super(modelo, numeroPlazas, precioPorDia);
        this.cilindrada = cilindrada;
        this.fabricante = fabricante;
    }

    public moto() {
    }
    //los getters e setters

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    //programa que devuelve cilindadas en litros
    public double getCilindadaLitros(){
        return this.cilindrada / 100.0;
    }
    //este devuelve en cadena de texto en formato de cc para Litros
    public String getEquivlenciaCilindrada(){
        return this.cilindrada + " cc equivale a " + getCilindadaLitros() + " litros";
    }
    public String toString(){
        return "Moto: " + this.modelo + " de " + this.fabricante + " (" + this.precioPorDia + " €/dia)";
    }
}
