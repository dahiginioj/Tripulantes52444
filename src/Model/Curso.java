package Model;

import java.util.ArrayList;

/**
 * Curso
 */
public class Curso {
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    private ArrayList<Tripulante> tripulantes;

    public Curso(int pCodigo, String pNombre, char pJornada, int fCodigo, String fNombre) {
        super();
        this.codigo=pCodigo;
        this.nombre=pNombre;
        this.jornada=pJornada;
        formador = new Formador(fNombre, fCodigo);
        tripulantes = new ArrayList<>();
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }
    
    public String agregarTripulante(Tripulante t) {
        tripulantes.add(t);
        return "Tripulante agregado al curso " + nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public char getJornada() {
        return jornada;
    }
    public Formador getFormador() {
        return formador;
    }
    
    
}