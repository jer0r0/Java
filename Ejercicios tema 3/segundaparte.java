
class Coche {
    int puertas = 0;
    public void add_door() {
        puertas = puertas +1;
    }
    
    public static void main(String[] args) {
       Coche coche1 = new Coche();
       coche1.add_door(); 
       System.out.println("El coche tiene "+ coche1.puertas+" puerta ");
       
    }
    
    
}
