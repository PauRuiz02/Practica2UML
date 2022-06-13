package uf3junypauruizautocode;

import java.util.ArrayList;
import java.util.List;

public class Institut {

    private String nom;
    List<Aules> aula = new ArrayList();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Aules> getAula() {
        return aula;
    }

    public void setAula(List<Aules> aula) {
        this.aula = aula;
    }
    
    
    
}
