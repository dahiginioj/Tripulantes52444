package Model;

import java.util.ArrayList;

/**
 * Curso
 */
public class Curso {

    public final static int MAXIMo_TRIPULANTES=2;

    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    private ArrayList<Tripulante> tripulantes;

    public Curso() {
        super();
    }

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
        if (tripulantes.size()==MAXIMo_TRIPULANTES) {
            return "No se puede agregar mas de "+MAXIMo_TRIPULANTES+ " Tripulantes";
        }
        tripulantes.add(t);
        return "Tripulante agregado al curso " + nombre;
    }

    public double calcularPromedioCurso() throws Exception{
        if (tripulantes.size()==0) {
            throw new Exception("No hay tripulantes registrados en el curso");
        }

        double total=0.0;
        for (Tripulante tripulante : tripulantes) {
            total +=tripulante.getAverage();
        }
        //for (int i = 0; i < tripulantes.size(); i++) {
        //    total+=tripulantes.get(i).getAverage();
        //}
        //return total/tripulantes.size();
        return total/0;
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