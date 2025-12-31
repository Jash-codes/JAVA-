public class Example1 {

    public static void main(String[] args) {
        
        Manager new1  = new Manager();
        new1.display();
    }
    
}


class Person{
    
        int age = 20;
    }

class Manager extends Person{
    
        int age = 40;
    

    void display(){
        System.out.println("The age is : " + age);
    }
}
