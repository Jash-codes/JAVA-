public class Animal{

    public static void main(String[] args) {
        
    Dog dog1 = new Dog();
    dog1.name = "Rocky";
    dog1.color = "brown";
    dog1.age = 3;
    dog1.displayDogInfo();
    
    }
}

class Dog{

    String name;
    String color;
    int age;

    void displayDogInfo(){

        System.out.println("Dog name is : " + name);
        System.out.println("Color is : " + color);
        System.out.println("Age is : " + age);
    }
}
