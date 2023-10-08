
package repaso;

public class Corresponsal extends Banco{

    public Corresponsal() {
    }

    public Corresponsal(String nombre, String direccion, String pagina, int telefono) {
        super(nombre, direccion, pagina, telefono);
    }

    public void recaudar() {
        System.out.println("Se consigna recaudo con banco principal");    }  
}
