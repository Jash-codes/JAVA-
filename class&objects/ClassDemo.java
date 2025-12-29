class students{

    int id;
    String name;
}

public class ClassDemo {
    public static void main(String[] args) {
        
        students s1 = new students();
        s1.id = 1;
        s1.name = "jash";

        students s2 = new students();
        s2.id = 2;
        s2.name = "jai";

        System.out.println("ID is - " + s1.id + " and the name is " + s1.name);
        System.out.println("ID is - " + s2.id + " and the name is " + s2.name);
        
    }
    
}
