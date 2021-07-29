import Model.Curso;
import Model.Tripulante;

public class App {
    public static void main(String[] args) throws Exception {
        Curso programacion1=new Curso(1234, "Fundamentos de programacion", 'M', 4444, "Dev 1");
        System.out.println(programacion1.getNombre());
        Tripulante t= new Tripulante();
        t.setNota1(4);
        t.setNota2(3);
        t.setNota3(5);
        System.out.println(programacion1.agregarTripulante(t));
        for (Tripulante desarrollador : programacion1.getTripulantes()) {
            System.out.println(desarrollador.getHighNote());
        }
    }
}
