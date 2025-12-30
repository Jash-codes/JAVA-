public class Multiple {

    public static void main(String[] args) {

        amphibiousmyvehicle mycar = new amphibiousmyvehicle();
        mycar.drive();
        mycar.sail();

    }

}

interface Landvehicle {
    default void drive() {

    }

}

interface Watervehicle {
    default void sail() {
    }
}

class amphibiousmyvehicle implements Landvehicle, Watervehicle {

    @Override
    public void drive() {
        System.out.println("I am Driving");
    }

    @Override
    public void sail() {
        System.out.println("I am sailing");
    }

}
