public class cars {

    String brand;
    String model;
    int year;
    String color;

    public cars(String brand,String model,int year,String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayinfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("year : " + year);
        System.out.println("Color : " + color);
    }

    public static void main(String[] args) {
        cars car1 = new cars("BMW","MK4",2025,"Black");
        System.out.println("Details of car 1");
        car1.displayinfo();
        System.out.println("------------------------------- ");

        cars car2 = new cars("Mahindra","XUV",2025,"White");
        System.out.println("Details of car 2");
        car2.displayinfo();

    }

}
