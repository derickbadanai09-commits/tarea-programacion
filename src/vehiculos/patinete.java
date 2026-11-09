package vehiculos;

public class patinete extends vehiculo {
    //atrubulos ddientro de la clase patinete que esta expandindo com la clase vehiculo
    private String marca;
    private Integer capacidadBateria;
    private boolean tieneLuces;
// los contructores
    public patinete(String modelo, int numeroPlazas, double precioPorDia, Integer capacidadBateria, String marca, boolean tieneLuces) {
        super(modelo, numeroPlazas, precioPorDia);
        this.capacidadBateria = capacidadBateria;
        this.marca = marca;
        this.tieneLuces = tieneLuces;
    }

    public patinete() {
    }
//los getters y setters
    public Integer getCspscidadBateria() {
        return capacidadBateria;
    }

    public void setCspscidadBateria(Integer capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTieneLuces() {
        return tieneLuces;
    }

    public void setTieneLuces(boolean tieneLuces) {
        this.tieneLuces = tieneLuces;
    }
    //calculadora do consumo que devuelva la autonomia
    public double getAutonomia(double consumo){
        return this.capacidadBateria / consumo;
    }
    public String toString(){
        return "Patinete " + this.modelo + " de " + this.marca + " (" + this.precioPorDia + " €/dia)";
    }

}
