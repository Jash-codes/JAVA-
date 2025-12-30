public class Single {

    public static void main(String[] args) {
        
        System.out.println("--- Creating Fourwheeler ---");
        Fourwheeler obj = new Fourwheeler();
        
        System.out.println("\n--- Creating Car ---");
        Car obj1 = new Car();
        
    }
    
}

class Fourwheeler{

    Fourwheeler() {
        System.out.println("This is a fourwheeler vehicle");
    }
    
}

class Car extends Fourwheeler{

    Car() {
        System.out.println("This four wheeler vehicle is a car");
    }
    
}