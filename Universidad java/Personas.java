public class Personas{
    public static void main(String[] args){

        //crear objetos

        Persona persona1= new Persona("Isabella", "Diaz", 123456, "06-06-2005");
        Persona persona2= new Persona("David", "Motato", 654321, "06-04-2005");

        System.out.println("Informacion persona 1");
        System.out.println("");
        persona1.imprimir();

        System.out.println("Informacion persona 2");
        System.out.println("");
        persona2.imprimir();
    }
} 
    

