public class Estudiante {
    int codigo;
    String nombre;
    double promedio;


    public Estudiante(int codigo, String nombre, double promedio) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.promedio=promedio;
    }

    //visualizar codigo
    public int getCodigo(){
        return codigo;
    }

    //visualizar promedio
    public double getPromedio(){
        return promedio;
    }

    //visualizar nombre
    public String getNombre(){
        return nombre;
    }

    //restar promedio
    public void resPromedio(){
        if(promedio>0){
        promedio--;
        }
    }

    //sumar promedio
    public void sumPromedio(){
        promedio++;
    }
}
