/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Galeria {
    ArrayList<imagensita>imagenes;
    
    public Galeria(){
            imagenes=new ArrayList<imagensita>() ;
            imagensita i1=new imagensita();
            i1.setUrl("/Proyecto/imagen1.png");
            i1.setTitulo("METRONOMY");
            i1.setDescripcion("Portada del album The english riviera 2008");
            
          
            imagensita i2=new imagensita();
            i2.setUrl("/Proyecto/imagen2.png");
            i2.setTitulo("METRONOMY");
            i2.setDescripcion("Portada del album Love letters del Año 2014");
            
            imagensita i3=new imagensita();
            i3.setUrl("/Proyecto/imagen3.png");
            i3.setTitulo("THE STROKES");
            i3.setDescripcion("Portada del album Comedown Machine");
            
            imagensita i4=new imagensita();
            i4.setUrl("/Proyecto/imagen4.png");
            i4.setTitulo("DEVENDRA BANHART");
            i4.setDescripcion("Portada del album 'MALA´");
            
            imagensita i5=new imagensita();
            i5.setUrl("/Proyecto/imagen5.png");
            i5.setTitulo("BLACK KIDS");
            i5.setDescripcion("Portada del album 'PARTIE TRAUMATIC´");
            
            //agreagar al array
            
            imagenes.add(i1);
            imagenes.add(i2);
            imagenes.add(i3);
            imagenes.add(i4);
            imagenes.add(i5);
            
            
            }

    public ArrayList<imagensita> LeerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<imagensita> imagenes) {
        this.imagenes = imagenes;
    }
    
           
    
}
