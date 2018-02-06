package libreria;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Libreria {

    private Libro libro;

    public void engadirLibros(ArrayList<Libro> libreria) {
        Libro a=new Libro();
        a.setAutor(JOptionPane.showInputDialog("Introduce el nombre del Autor"));
        a.setTitulo(JOptionPane.showInputDialog("Introduce el Titulo"));
        a.setIsbn(JOptionPane.showInputDialog("Introduce el ISBN"));
        a.setNumUni(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de libros")));
        a.setPrezo(Float.parseFloat(JOptionPane.showInputDialog("Introduce el Precio")));

        libreria.add(a);

    }
    public void venderLibros(String isbn,ArrayList<Libro> libreria){
        int venta=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de libros que se vende"));
        for(int i=0;i<libreria.size();i++){
            if(libreria.get(i).getIsbn()==isbn){
                int unidades=libreria.get(i).getNumUni();
                int total=unidades-venta;
                libreria.get(i).setNumUni(total);
            }
        }
        int x=Integer.parseInt(JOptionPane.showInputDialog("Numero de ventas de un libro"));
    }

    public void amosarLibros(ArrayList<Libro> libreria) {
        Iterator it=libreria.iterator();
        while (it.hasNext()) {

            Libro libro=(Libro) it.next();
            System.out.println(libro.getAutor()+" "+libro.getTitulo()+" "+libro.getIsbn()+" "+libro.getPrezo()+"  "+libro.getNumUni());
        }
        System.out.println("\n");
    }

}
