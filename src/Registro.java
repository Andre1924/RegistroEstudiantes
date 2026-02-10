
import java.util.ArrayList;

public class Registro {
    ArrayList<Estudiante> datos = new ArrayList<>();

    //mostrar todos los estudiantes
    public void mostrarEstudiantes(){
        for (Estudiante dato : datos) {
            System.out.println("Nombre: "+dato.getNombre());
            System.out.println("Código: "+dato.getCodigo());
            System.out.println("Promedio: "+dato.getPromedio());
        }
    }

    //buscar estudiante por codigo
    public void buscarEstudiante(int codigo){
        boolean estudianteEncontrado=false;
        for (Estudiante dato : datos) {
            if(dato.getCodigo()==codigo){
                estudianteEncontrado=true;
                System.out.println("el estudiante es: "+dato.getNombre());
            }
        }
        if(estudianteEncontrado==false){
            System.out.println("estudiante no encontrado");
        }
    }

    //modificar el promedio del estudiante
    public void modificarPromedio(int codigo, int operacion){
        boolean codigoIgual=false;
        for (Estudiante dato : datos) {
            if(dato.getCodigo()==codigo){
                codigoIgual=true;
                if(operacion==1){
                    dato.sumPromedio();
                }
                else if(operacion==2){
                    dato.resPromedio();
                }
                else{
                    System.out.println("operacion no valida");
                }
            }
        }
        if(codigoIgual==false){
            System.out.println("estudiante no encontrado");
        }
    }
}
