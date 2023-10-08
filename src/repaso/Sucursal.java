
package repaso;

import java.io.Serializable;

public class Sucursal extends Banco implements Serializable{
    String nombreGerente;
    
    public Sucursal() {
    }

    public Sucursal(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public Sucursal(String nombreGerente, String nombre, String direccion, String pagina, int telefono) {
        super(nombre, direccion, pagina, telefono);
        this.nombreGerente = nombreGerente;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public void recaudar() {
        System.out.println("Se envia recaudo con transportadora");
    }
    
}
