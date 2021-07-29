package view;


import Model.Curso;
import Model.Formador;

public class Vista {

    public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 77777, "Marco");
        Curso cursoItaliano = new Curso(52442, "Italiano 102", 'D', 33333, "David");
        
        Formador profesor= new Formador("Carlos", 34343);
        System.out.println(profesor.getCodigo());

        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoItaliano.getFormador().getCodigo());
        // System.out.println(cursoFrances.getCodigo());
        // System.out.println(cursoFrances.getJornada());
        // System.out.println(cursoItaliana.getCodigo());
        // System.out.println(cursoItaliana.getCodigo());
        // System.out.println(cursoFrances.getFormador());
        
        
    }
}
