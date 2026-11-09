package usuarios;

import vehiculos.vehiculo;

public class cliente extends usuario{
    // los atributos de la classe cliente
    private vehiculo v1;
    private int numSocio;
//constructores completo
    public cliente(int anyoNacimiento, String contrasenya, int id, String nombreUsuario, int numSocio, vehiculo v1) {
        super(anyoNacimiento, contrasenya, id, nombreUsuario);
        this.numSocio = numSocio;
        this.v1 = v1;
    }
//contructores vacio
    public cliente() {
    }
    //los getters y setters
    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public vehiculo getV1() {
        return v1;
    }

    public void setV1(vehiculo v1) {
        this.v1 = v1;
    }
    public double calcularPrecio(int numVehiculo, int dias){
        return numVehiculo * dias * getV1().getPrecioPorDia();
    }
    public String toString(){
        return " Cliente " + this.nombreUsuario + this.id;
    }
}
