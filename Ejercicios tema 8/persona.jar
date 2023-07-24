import javax.swing.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in); //Esta parte es el scanner para leer los datos que el usuario pone en console input en pyhtonh
        Persona persona= new Persona();
        
        persona.set_edad();
        System.out.println("Ingrese el nombre");
        String nombre= entrada.next();
        persona.set_nombre(nombre);
        System.out.println("Ingrese el telefono");
        long telefono = entrada.nextLong();
        persona.set_telefono(telefono);
        persona.print();

    }


}
class Persona{
    //Atributos
    private int edad;
    private String nombre;
    private long telefono;

    //SETS

    public void set_edad(){
        //Este set es diferente pues 
        //la edad de una persona no puede ser negativa entonce pido la
        //funcion al usuario dentro de la funcion para así poder llamarla de nuevo y solicitandole la edad de nuevo
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        if(edad >=0){
            this.edad = edad;
        }else{
            System.out.println("La edad no es valida,intente de nuevo");
            this.set_edad();
        }
    }
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
    public void set_telefono(long telefono){
        this.telefono= telefono;
    }

    //GETS
    public int get_edad(){
        return this.edad;
    }
    public String get_nombre(){
        return this.nombre;
    }
    public long get_telefono(){
        return this.telefono;
    }

    public void print() {
        System.out.println("La edad es:\t"+this.get_edad()+"\n" +
                "El nombre es:\t"+this.get_nombre()+"\n"+
                "El telefono es:\t"+this.get_telefono()+"\n");
    }
}
