
package lab2p2_carlosespinal;

public class Escritos {
    private int totalPalabras;
    private String Epoca;
    private String Genero;
    private String Autor;

    public Escritos(int totalPalabras, String Epoca, String Genero, String Autor) {
        this.totalPalabras = totalPalabras;
        this.Epoca = Epoca;
        this.Genero = Genero;
        this.Autor = Autor;
    }

    public int getTotalPalabras() {
        return totalPalabras;
    }

    public void setTotalPalabras(int totalPalabras) {
        this.totalPalabras = totalPalabras;
    }

    public String getEpoca() {
        return Epoca;
    }

    public void setEpoca(String Epoca) {
        this.Epoca = Epoca;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Ttoal de palabras del escrito: " + totalPalabras + "\nEpoca en la que se redacto: " + Epoca + "\nGenero literario: " + Genero + "\nAutor del escrito: " + Autor + '}';
    }
    
    
}
