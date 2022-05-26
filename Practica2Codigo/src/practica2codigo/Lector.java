package practica2codigo;


import java.util.List;

public class Lector {

    private String nom;

    private String edad;

    private String dni;

    private List<Llibre> llibres;

    public int maxLlibres() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Lector(String nom, String edad, String dni, List<Llibre> llibres) {
        this.nom = nom;
        this.edad = edad;
        this.dni = dni;
        this.llibres = llibres;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }
    
    
}
