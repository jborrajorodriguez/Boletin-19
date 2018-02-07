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

    public void venderLibros(ArrayList<Libro> libreria) {
        String isbn=JOptionPane.showInputDialog("ISBN del libro");
        int venta=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de libros que se vende"));
        for (int i=0; i<libreria.size(); i++) {
            if (libreria.get(i).getIsbn().equals(isbn)) {
                int unidades=libreria.get(i).getNumUni();
                int total=unidades-venta;
                libreria.get(i).setNumUni(total);
            }
        }

    }

    public void amosarLibros(ArrayList<Libro> libreria) {
        Iterator it=libreria.iterator();
        while (it.hasNext()) {

            Libro libro=(Libro) it.next();
            System.out.println(libro.getAutor()+" "+libro.getTitulo()+" "+libro.getIsbn()+" "+libro.getPrezo()+"  "+libro.getNumUni());
        }

    }

    public void darDeBaixa(ArrayList<Libro> libreria) {
        for (int i=0; i<libreria.size(); i++) {
            if (libreria.get(i).getNumUni()==0) {
                libreria.remove(i);
            }
            else {
                System.out.println("No hay libros sin unidades");
            }

        }
    }

    public void consultar(ArrayList<Libro> libreria) {
        int m;
        do {
            m=Integer.parseInt(JOptionPane.showInputDialog("Metodo de busqueda \n1 Busqueda por titulo \n2 Busqueda por autor \n3 Busqueda por ISBN \n 0 volver"));

            switch (m) {

                case 1:
                    String titulo=JOptionPane.showInputDialog("Esribe el titulo del libro");
                    for (int i=0; i<libreria.size(); i++) {
                        if (libreria.get(i).getTitulo().equals(titulo)) {
                            Libro libro=libreria.get(i);
                            System.out.println(libro.toString());
                        }
                        else {
                            System.out.println("No hay ningun libro con ese titulo");

                        }
                    }
                    break;
                case 2:
                    String autor=JOptionPane.showInputDialog("Esribe el autor del libro");
                    for (int i=0; i<libreria.size(); i++) {
                        if (libreria.get(i).getAutor().equals(autor)) {
                            Libro libro=libreria.get(i);
                            System.out.println(libro.toString());
                        }
                        else {
                            System.out.println("No hay ningun libro con ese autor");

                        }
                    }
                    break;
                case 3:
                    String isbn=JOptionPane.showInputDialog("Esribe el ISBN del libro");
                    for (int i=0; i<libreria.size(); i++) {
                        if (libreria.get(i).getIsbn().equals(isbn)) {
                            Libro libro=libreria.get(i);
                            System.out.println(libro.toString());
                        }
                        else {
                            System.out.println("No hay ningun libro con ese ISBN");

                        }
                    }
                    break;

            }

        }
        while (m!=0);

    }
}
