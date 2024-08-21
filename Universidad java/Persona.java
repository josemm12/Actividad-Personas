public class Persona{

    //Atributos
    public String nombre;
    public String apellido;
    public int Id;
    public String fecha_nacimiento;

    //Constructor 

    public Persona (String nombre, String apellido, int Id, String fecha_nacimiento){

        this.nombre = nombre;
        this.apellido = apellido;
        this.Id = Id;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void imprimir(){
        System.out.println("nombre "+ nombre);
        System.out.println("apellido "+ apellido);
        System.out.println("Identificación "+Id);
        System.out.println("Fecha Nacimiento "+ fecha_nacimiento);
    
    }
}


