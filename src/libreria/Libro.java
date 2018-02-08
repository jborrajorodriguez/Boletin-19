package libreria;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Libro implements Comparable {
    
    private String titulo,autor,isbn;
    private float prezo;
    private int numUni;

    public Libro() {
    }
    
    

    public Libro(String titulo,String autor,String isbn,float prezo,int numUni) {
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.prezo=prezo;
        this.numUni=numUni;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor=autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn=isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo=prezo;
    }

    public int getNumUni() {
        return numUni;
    }

    public void setNumUni(int numUni) {
        this.numUni=numUni;
    }

    @Override
    public String toString() {
        return (" Autor: "+autor+"Titulo :"+titulo+" ISBN :"+isbn+" Prezo: "+prezo+" Numero de unidades: "+numUni);
    }

    @Override
    public int compareTo(Object o) {
        Libro libro=(Libro)o;
        if(titulo.compareToIgnoreCase(libro.getTitulo())>0){return 1;
        
        }else if(titulo.compareToIgnoreCase(libro.getTitulo())==0){return 0;
        
        }else return -1;
    }
    
    
    

}
