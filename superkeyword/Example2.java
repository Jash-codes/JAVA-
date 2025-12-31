public class Example2 {

    public static void main(String[] args) {
        
        Car new1 = new Car();

        new1.speed();
        new1.display();
    }
    
}

class Vehicle {
    void speed(){
        System.out.println("This is Vehicle speed");
    }
}

class Car extends Vehicle{
    void speed(){
        System.out.println("This is car speed");
    }

    void display(){
        speed();
            super.speed();
        }
    }

