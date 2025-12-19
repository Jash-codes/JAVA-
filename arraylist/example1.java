import java.util.ArrayList;

public class example1{

    public static void main(String[]args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Jash");
        names.add("anu");
        names.add("max");
        // names.add("max"); // used for lastindex 

        // names.add(2, "anusha");
        // names.remove(1);
        // names.get(0);
        // names.set(0, "jashwanth");
        // names.add(0, "jash");


        System.out.println(names);        
        System.out.println(names.contains("anu"));
        System.out.println(names.isEmpty());
        // System.out.println(names.lastIndexOf("max")); // repeating elements
        System.out.println(names.size());
        
    }
}