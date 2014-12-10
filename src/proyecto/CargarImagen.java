/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Jules
 */
public class CargarImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         imagensita i=new imagensita();
         i.getTitulo();
       i.setDescripcion(null);
       i.getUrl();
        GuardarImagen p=new GuardarImagen();
        p.GuardarImagen(i);
       
       
       
        // TODO code application logic here
    }
    
}
