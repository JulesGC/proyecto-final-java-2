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
            i1.setUrl("/proyecto/voidz.png");
            i1.setTitulo("chavas guapas");
            i1.setDescripcion("Portada promocional de playeras");
            
          
            imagensita i2=new imagensita();
            i2.setUrl("/proyecto/ana.png");
            i2.setTitulo("Anna Prior");
            i2.setDescripcion("Baterista de la banda Metronomy");
            
            imagensita i3=new imagensita();
            i3.setUrl("/proyecto/love.png");
            i3.setTitulo("Love Letters");
            i3.setDescripcion("Tercer album de la banda Metronomy");
            
            imagensita i4=new imagensita();
            i4.setUrl("/proyecto/metronomy.png");
            i4.setTitulo("The English Riviera");
            i4.setDescripcion("Segundo Album de estudio de la vbanda Metronomy");
            
            imagensita i5=new imagensita();
            i5.setUrl("/proyecto/met.png");
            i5.setTitulo("");
            i5.setDescripcion(".......");
            
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
