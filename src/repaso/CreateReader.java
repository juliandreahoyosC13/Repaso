
package repaso;

import java.io.*;

public class CreateReader {
    
    //Se crea un constructor vacio para poder usar sus metodos
    public CreateReader() {
    }
    public void Create(Sucursal miSucursal){
        //Para crear un archivo
        try{
        //    
        FileOutputStream archivo = new FileOutputStream("Sucursales.txt", true);
        //El objeto sucursal
        ObjectOutputStream ArchivoSucursales = new ObjectOutputStream(archivo);
        //Archivo de texto plano, escribir
        ArchivoSucursales.writeObject(miSucursal);
        
        } catch (Exception e){ 
        }
    }
}

