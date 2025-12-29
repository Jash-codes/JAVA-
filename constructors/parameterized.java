public class parameterized {

    String name;
    int age;

    parameterized(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("hi my name is " + name + " and my age is " + age);
    }

    public static void main(String[] args) {
        
        parameterized person1 = new parameterized("Jashwanth", 20);
        person1.display();
    }


}
