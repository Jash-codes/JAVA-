public class Multilevel {

    public static void main(String[] args) {

        System.out.println("------VEHICLE-------");
        Vehicle v1 = new Vehicle();

        System.out.println("------FOURWHEELER-------");
        
        MultiFourWheeler F1 = new MultiFourWheeler(); 

        System.out.println("------CAR---------");
        
        MultiCar c1 = new MultiCar();
    }

}

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class MultiFourWheeler extends Vehicle { 
    MultiFourWheeler() {
        System.out.println("This is a Fourwheeler");
    }
}

class MultiCar extends MultiFourWheeler {
    MultiCar() {
        System.out.println("This is a Fourwheeler car");
    }
}