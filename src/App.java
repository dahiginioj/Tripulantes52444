import Model.Curso;
import Model.Tripulante;

public class App {
    public static void main(String[] args) {

        Curso programacion1=new Curso(1234, "Fundamentos de programacion", 'M', 4444, "Dev 1");
        System.out.println(programacion1.getNombre());

        try {
            System.out.println(programacion1.calcularPromedioCurso());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Tripulante t1= new Tripulante();
        t1.setNombre("Primer tripulante");
        t1.setNota1(3);
        t1.setNota2(3);
        t1.setNota3(4);
        Tripulante t2= new Tripulante();
        t2.setNombre("Segundo tripulante");
        t2.setNota1(4);
        t2.setNota2(3);
        t2.setNota3(5);
        Tripulante t3= new Tripulante();
        t3.setNombre("Tercer tripulante");;
        t3.setNota1(4);
        t3.setNota2(3);
        t3.setNota3(5);
        System.out.println(programacion1.agregarTripulante(t1));
        System.out.println(programacion1.agregarTripulante(t2));
        System.out.println(programacion1.agregarTripulante(t3));
        for (Tripulante desarrollador : programacion1.getTripulantes()) {
            System.out.println(desarrollador.getHighNote());
            System.out.println(desarrollador.getNombre());
        }


        Tripulante estudiante= new Tripulante("David Higinio", 486888, 0.0, 0.0, 0.0, 1001499845, "dahiginioj@unal.edu.co");
        System.out.println(estudiante.getEmail());
        Curso c= new Curso();
        System.out.println(estudiante.agregarCurso(c));
        
        //System.out.println(programacion1.calcularPromedioCurso());
    }
}
