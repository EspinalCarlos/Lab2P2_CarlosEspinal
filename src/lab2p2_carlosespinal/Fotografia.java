
package lab2p2_carlosespinal;

public class Fotografia {
    private String Dimension;
    private String Resolucion;
    private boolean isBlackWhite;

    public Fotografia(String Dimension, String Resolucion, boolean isBlackWhite) {
        this.Dimension = Dimension;
        this.Resolucion = Resolucion;
        this.isBlackWhite = isBlackWhite;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    public String getResolucion() {
        return Resolucion;
    }

    public void setResolucion(String Resolucion) {
        this.Resolucion = Resolucion;
    }

    public boolean isIsBlackWhite() {
        return isBlackWhite;
    }

    public void setIsBlackWhite(boolean isBlackWhite) {
        this.isBlackWhite = isBlackWhite;
    }

    @Override
    public String toString() {
        if(isBlackWhite == false){
            return "Dimensiones de la imagen: " + Dimension + "\nResolucion de la imagen: " + Resolucion +"\nImagen a color";
        }else{
            return "Dimensiones de la imagen: " + Dimension + "\nResolucion de la imagen: " + Resolucion +"\nImagen blanco y negro";
        }
    }
    
    
}
