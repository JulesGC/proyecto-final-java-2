package proyecto;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Jules
 */
public class PersistenciaImagensita {
    public static void guardarImagen(imagensita  i){
          ArrayList<imagensita> imagenes=new ArrayList<imagensita>();
        try{
            File file=new File("archivo");
            if(file.exists()){
            imagenes=    leerTodasLasImagenes();
            }
            imagenes.add(i);
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(imagenes);
            System.out.println("Guardado cone xito:");
        }catch(Exception e){
            
        }
    }
    
    public static ArrayList<imagensita> leerTodasLasImagenes(){
        ArrayList<imagensita> imagenes=new ArrayList<imagensita>();
      File file=new File("archi");
  
      try{
      FileInputStream fis=new FileInputStream(file);
      ObjectInputStream ois=new ObjectInputStream(fis);
      imagensita=(ArrayList<imagensita>)ois.readObject();
      System.out.println("Leido con exito");
      }catch(Exception e){
          
      }
      return imagenes;
    }
    
    public static imagensita leerImagenPorId(int id){
        imagensita ima=null;
        try{
           ima=  leerTodasLasImagenes().get(id);
        }catch(Exception e){
            
        }
        return ima;
    }
    
}
    

