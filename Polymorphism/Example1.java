public class Example1 {  // RUNTIME - METHOD OVERRIDING
    public static void main(String[] args) {

        System.out.println("-----PERSON-------");
        Person new1 = new Person();
        new1.role();

        System.out.println("-------HUSBAND--------");
        Husband new2 = new Husband();
        new2.role();

        System.out.println("--------FATHER---------");
        Father new3 = new Father();
        new3.role();

    }

}

class Person {
    void role() {
        System.out.println("I'm a Person");
    }
}

class Husband extends Person {
    @Override
    void role() {
        System.out.println("I'm a Husband");
    }
}

class Father extends Person {
    @Override
    void role() {
        System.out.println("I'm a Father");
    }
}
