package usuarios;

import vehiculos.vehiculo;

public class administrador extends usuario {
    // los atributos de la classe administrador
    private enum Roi {JEFE,VENDEDOR}
    private Roi roi;

    public administrador(int anyoNacimiento, String contrasenya, int id, String nombreUsuario, Roi roi) {
        super(anyoNacimiento, contrasenya, id, nombreUsuario);
        this.roi = roi;
    }
//constructores vacio
    public administrador() {
    }
//los getters y setters
    public Roi getRoi() {
        return roi;
    }

    public void setRoi(Roi roi) {
        this.roi = roi;
    }
    public void asignarVehiculo( cliente cliente, vehiculo v1){
        cliente.setV1(v1);

    }
    public void retirarVehiculo(cliente cliente){
        cliente.setV1(null);
    }
    public String toString(){
        return " Administrador" + this.nombreUsuario + " (" + this.id + ") ";
    }
}

