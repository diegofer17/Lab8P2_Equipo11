package lab8p2_equipo11;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private int CantSeres;
    private ArrayList <SerVivo> Svs;

    public Universo() {
    }

    public Universo(String nombre, int CantSeres, ArrayList<SerVivo> Svs) {
        this.nombre = nombre;
        this.CantSeres = CantSeres;
        this.Svs = Svs;
    }

    public Universo(String nombre, ArrayList<SerVivo> Svs) {
        this.nombre = nombre;
        this.Svs = Svs;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantSeres() {
        return CantSeres;
    }

    public void setCantSeres(int CantSeres) {
        this.CantSeres = CantSeres;
    }

    public ArrayList<SerVivo> getSvs() {
        return Svs;
    }

    public void setSvs(ArrayList<SerVivo> Svs) {
        this.Svs = Svs;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", CantSeres=" + CantSeres + '}';
    }
    
}
