package vehiculos;

public class furgoneta  extends vehiculo{
    // los atributos de la classe furguneta
    private String fabricante;
    private  Integer volumenCarga;
//los constructores completo
    public furgoneta(String modelo, int numeroPlazas, double precioPorDia, String fabricante, Integer volumenCarga) {
        super(modelo, numeroPlazas, precioPorDia);
        this.fabricante = fabricante;
        this.volumenCarga = volumenCarga;
    }
//contructores vacio
    public furgoneta() {
    }
//todos los getters y setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(Integer volumenCarga) {
        this.volumenCarga = volumenCarga;
    }
    //devuelva true se elvolumen es mayor o igual que 20
    public boolean esGrande(){
        return this.volumenCarga >= 20;
    }
    //devuelva tru si el volumen dado por parametro es menor que el volumenCarga
    public boolean cabeVolumen(double volumen){
        return volumen < this.volumenCarga;
    }
    public String toString(){
        return "Furgoneta: " + this.modelo + " de " + this.fabricante + " (" + this.precioPorDia + " €/dia";

    }
}
