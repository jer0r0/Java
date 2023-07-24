import java.util.Scanner;

public class pedirdatos {
    public static void main(String[] args) {

      //1
        Scanner entrada=new Scanner(System.in); //Esta parte es el scanner para leer los datos que el usuario pone en console input en pyhtonh
        System.out.println("Ingrese un numero para la comparación positivo negativo");
        int numeroif = entrada.nextInt(); //Asiganación al numero que se usa en la comparación if 
        if(numeroif > 0) {
            System.out.println("El numero es positivo");
        }else if(numeroif < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }
      
        System.out.println("Ingrese un numero para la comparación while");
        int numerowhile = entrada.nextInt(); //Asignación al numero que se usa para el parametro del while 

      //2
        while(numerowhile < 3){
             System.out.println("El numero es\t" + numerowhile);
            numerowhile = numerowhile +1;
        }
      
      //3
        do{
            System.out.println("El numero dentro del do while es\t" + numerowhile);
        }while(numerowhile >3);
      //4
        for(int i = 0; i <=3;i++ ){
            System.out.println("El numero dentro del for es\t" + i);
        }
      //5
        System.out.println("Ingrese la estacion que desea comparar");
        var estacion = entrada.next();
        switch (estacion){
            case "VERANO":
                System.out.println("la estación es VERANO");
                break;
            case "INVIERNO":
                System.out.println("la estación es INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("la estación es PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("la estación es OTOÑO");
                break;
            default:
                System.out.println("estoy en default");
        }


    }
}
