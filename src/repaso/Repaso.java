
package repaso;

import java.util.ArrayList;
import java.util.List;

public class Repaso {

    public static void main(String[] args) {
        //Para uso de polimorfismo, se crea una lista que almacene diferentes tipos de datos
        // List y lo que va a almacenar 
        List<Banco> dependencia = new ArrayList();
        //Tiene un metodo constructor y new  es espacio en memoria 
        Banco mibanco = new Banco();
        Banco mibanco2 = new Banco("Popular", "Medellin","Popilar.c13", 31597465);
        System.out.println("El nombre del banco es: " + mibanco2.getNombre());
        Corresponsal corresponsal1 = new Corresponsal("TiendaC13","Medellin","Popular.C13",23254875);
        Sucursal sucursal1 = new Sucursal("Pedro Pablo","Tu sucursal","San Javier","Popular.SanC13",3264851);
        //Para agregar a esa lista, reciben tipos de datos diferentes aunque se almacenen en una sola lista
        dependencia.add(corresponsal1);
        dependencia.add(sucursal1);  
        
    }
    
}
