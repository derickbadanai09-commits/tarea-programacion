package usuarios;

public class usuario {
    // los atributos de la classe usuario
    protected String nombreUsuario;
    private String contrasenya;
   protected int id;
    private int anyoNacimiento;
//constructores completo
    public usuario(int anyoNacimiento, String contrasenya, int id, String nombreUsuario) {
        this.anyoNacimiento = anyoNacimiento;
        this.contrasenya = contrasenya;
        this.id = id;
        this.nombreUsuario = nombreUsuario;
    }
//constructor vacio
    public usuario() {
    }
    //los getters y setters
    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    //dame tru si tiene 10 anyos o mas tomando 2026 como anyo actual
    public boolean esAdulto(){
        return (2026 - this.anyoNacimiento) >= 18;
    }
    public boolean contrasenyaSegura(){
        return this.contrasenya.length() > 10;
    }
    public String toString(){
        return this.nombreUsuario + " (" + this.id + ") ";
    }
}
