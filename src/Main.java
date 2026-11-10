import usuarios.administrador;
import usuarios.cliente;
import vehiculos.*;

public class Main {
    public static void main(String[] args){
        coche coche1 = new coche(" BMW X2", 5, 55.3, 300, "BWM", coche.Motor.GASOLINA);
        coche coche2 = new coche("Golf GTI", 5, 44.7, 245, "Volkswagen", coche.Motor.GASOLINA);
        moto moto1 = new moto("Kawasaki Z900", 2, 27.5, 948, "Kawasaki");
        moto moto2 = new moto("Honda XJ6", 2, 21.3, 600, "Honda");
        patinete patinete1 = new patinete("Xiaomi Scooter 6 Max", 1, 15.2, 468, "Xiomi", true );
        patinete patinete2 = new patinete("Xiaomi Mi Electric 3", 1, 12.5, 7650, "Xiomi", true);
        furgoneta furgoneta1= new furgoneta("Proace City Verso", 5, 53.9, "Toyota", 4400);
        furgoneta furgoneta2 = new furgoneta("Crafter 35 Chasis CS RS ", 3, 49.3, "Volkswagen", 6000);
        cliente cliente1 = new cliente(1994, "pepitinho1029", 102938, "Pepito", 181, coche1 );
        cliente cliente2 = new cliente(2001, "Lautita123", 1234, "Laurita", 5432, coche2);
        administrador adm1 = new administrador(1992, "RinTintin123", 20103, "Vladimir", administrador.Roi.JEFE);



        }

    }
