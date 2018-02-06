package boletin.pkg19;
import java.util.ArrayList;
import libreria.Libreria;
import libreria.Libro;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin19 {

    public static void main(String[] args) {
        Libreria lib=new Libreria();
        ArrayList <Libro> libreria =new ArrayList();
        lib.engadirLibros(libreria);
        lib.engadirLibros(libreria);
        lib.amosarLibros(libreria);
        

    }

}
