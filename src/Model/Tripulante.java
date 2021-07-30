package Model;
/**
 * Tripulante
 */

import java.util.ArrayList;

public class Tripulante {

    public final static double NOTA_MAXIMA= 5.0;

    /**
     * Atributos
     */
    
    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion;
    private String email;

    private ArrayList<Curso> cursos;

    public Tripulante() {
        super();
    }

    public Tripulante(String tNombre, int id, double nota1, double nota2, double nota3, float numeroIdent, String email) {
        super();
        this.nombre=tNombre;
        this.id=id;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.numeroIdentificacion=numeroIdent;
        this.email=email;
        cursos=new ArrayList<>();
    }


    /** getters*/
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public String agregarCurso(Curso c) {
        cursos.add(c);
        return "Curso agregado al tripulante "+ nombre;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public float getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public String getEmail() {
        return email;
    }

    /** setters*/
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setNumeroIdentificacion(float numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public double getAverage() {
        return (nota1 + nota2 + nota3)/3;
    }

    
    public double getHighNote() {

        if (nota1>=nota2 && nota1>=nota3 && nota1<=NOTA_MAXIMA) {
           return nota1;
        } else if (nota2>=nota3 && nota2<=NOTA_MAXIMA) {
            return nota2;
        } else {
            return nota3;
        }

    }
    public double getLowNote() {
        if (nota1<=nota2 && nota1<=nota3) {
            return nota1;
        } else if (nota2<=nota3) {
            return nota2;
        }
        else {
            return nota3;
        }//si alguno de los condicionales ejecuta el return entonces, sera la ultima linea que se ejecuta dentro del metodo
    }
    
    public boolean checkIfPass() {
        if (getAverage() >=3) {
            return true;
        }
        return false;
    }
    

}
