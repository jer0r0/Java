
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in); //Esta parte es el scanner para leer los datos que el usuario pone en console input en pyhtonh

        Cliente persona= new Cliente();
        System.out.println("cliente heredado de clase persona");

        persona.set_edad();

        System.out.println("Ingrese el nombre");
        String nombre= entrada.next();
        persona.set_nombre(nombre);

        System.out.println("Ingrese el telefono");
        long telefono = entrada.nextLong();
        persona.set_telefono(telefono);

        System.out.println("Ingrese el credito");
        long credito = entrada.nextLong();
        persona.set_credito(credito);



        System.out.println("Trabajador heredado de clase persona");
        Trabajador persona2= new Trabajador();

        persona2.set_edad();

        System.out.println("Ingrese el nombre");
        String nombre2= entrada.next();
        persona2.set_nombre(nombre2);

        System.out.println("Ingrese el telefono");
        long telefono2 = entrada.nextLong();
        persona2.set_telefono(telefono2);

        System.out.println("Ingrese el credito");
        long salario = entrada.nextLong();
        persona2.set_salario(salario);

        persona.print();
        persona2.print();

    }


}
class Persona{
    //Atributos
     int edad;
     String nombre;
     long telefono;

    //SETS

    public void set_edad(){
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
                "El telefono es:\t"+this.get_telefono());
    }
}
class Cliente extends Persona{
     long credito;

     public void set_credito(long credito){
         this.credito = credito;
     }

    public long get_credito(){
        return this.credito;
    }


    public void print() {
        super.print();
        System.out.println("El credito es de: "+this.get_credito());
    }
}

class Trabajador extends Persona{
     long salario;
    public void set_salario(long credito){
        this.salario = credito;
    }

    public long get_salario(){
        return this.salario;
    }


    public void print() {
        super.print();
        System.out.println("El Salario es de: "+this.get_salario());
    }
}
