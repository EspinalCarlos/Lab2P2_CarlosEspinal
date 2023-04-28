
package lab2p2_carlosespinal;

import java.util.Date;

public class Escultura {
    private String Escultor;
    private String Material;
    private Date dateEsculpir;
    private String Departamento;

    public Escultura(String Escultor, String Material, Date dateEsculpir, String Departamento) {
        this.Escultor = Escultor;
        this.Material = Material;
        this.dateEsculpir = dateEsculpir;
        this.Departamento = Departamento;
    }

    public String getEscultor() {
        return Escultor;
    }

    public void setEscultor(String Escultor) {
        this.Escultor = Escultor;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public Date getDateEsculpir() {
        return dateEsculpir;
    }

    public void setDateEsculpir(Date dateEsculpir) {
        this.dateEsculpir = dateEsculpir;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Escultor: " + Escultor + "\nMaterial: " + Material + "\nFecha en que se comenzo a esculpir: " + dateEsculpir + "\nDepartamento en el museo: " + Departamento;
    }
    
    
}
