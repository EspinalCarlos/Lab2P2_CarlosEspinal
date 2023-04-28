
package lab2p2_carlosespinal;

import java.util.Date;


public class Pintura {
    private String nomPintura;
    private String Autor;
    private Date fpresentation;
    private Date fadquisition;
    private boolean isExpuesta;

    public Pintura(String nomPintura, String Autor, Date fpresentation, Date fadquisition, boolean isExpuesta) {
        this.nomPintura = nomPintura;
        this.Autor = Autor;
        this.fpresentation = fpresentation;
        this.fadquisition = fadquisition;
        this.isExpuesta = isExpuesta;
    }

    public String getNomPintura() {
        return nomPintura;
    }

    public void setNomPintura(String nomPintura) {
        this.nomPintura = nomPintura;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Date getFpresentation() {
        return fpresentation;
    }

    public void setFpresentation(Date fpresentation) {
        this.fpresentation = fpresentation;
    }

    public Date getFadquisition() {
        return fadquisition;
    }

    public void setFadquisition(Date fadquisition) {
        this.fadquisition = fadquisition;
    }

    public boolean isIsExpuesta() {
        return isExpuesta;
    }

    public void setIsExpuesta(boolean isExpuesta) {
        this.isExpuesta = isExpuesta;
    }

    @Override
    public String toString() {
        if (isExpuesta == true) {
          return  "Pintura: " + nomPintura + "\nAutor: " + Autor + "\nFecha de Presentacion: " + fpresentation + "\nFecha de Adquisicion: " + fadquisition+"\nEn exposicion";  
        } else{
            return  "Pintura: " + nomPintura + "\nAutor: " + Autor + "\nFecha de Presentacion: " + fpresentation + "\nFecha de Adquisicion: " + fadquisition+"\nAun no esta en exposicion";
        }
    }
    
    
    
    
}
