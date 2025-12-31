public class Example2 {

    public static void main(String[] args) {
        Maths obj = new Maths();
        obj.display();
    }
    
}

class Maths{
    static int a = 10;
    static int b;

    static{
        System.out.println("Static block");
        b = a * 5;
    }

    void display(){
        System.out.println(" a is : " + a + "\n b is : " + b);
    }
}
