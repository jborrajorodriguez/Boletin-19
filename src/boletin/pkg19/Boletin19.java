package boletin.pkg19;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import libreria.Libreria;
import libreria.Libro;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin19 {

    public static void main(String[] args) {
         Libreria lib=new Libreria();
         ArrayList <Libro> libreria =new ArrayList();
         libreria.add(new Libro("Hola","Juan","123A",12,20));
         libreria.add(new Libro("Asios","Arturo","145A",13,200));
         libreria.add(new Libro("Estudio","Juan","ABC",12,3));
         libreria.add(new Libro("Vigo","Carlos","356Q",12,500));
         libreria.add(new Libro("Puentes","Juan","586Q",1212,200));
        int m;
        do {
            m=Integer.parseInt(JOptionPane.showInputDialog("*******Menu******\n1 Añadir Libro\n2 Vender Libro\n3 Mostrar Libreria\n4 Dar de Baixa os libros\n5 Consultar libro determinado\n0 Salir" ));
            switch (m) {

                case 1:lib.engadirLibros(libreria);
                    break;
                case 2:lib.venderLibros(libreria);
                    break;
                    
                case 3:lib.ordenar(libreria);
                    break;
                case 4:lib.darDeBaixa(libreria);
                    break;
                case 5:lib.consultar(libreria);
                
                break;
                    
            }

        }
        while (m!=0);
        
        
        
        

    }

}
