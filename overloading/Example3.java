public class Example3 {

    public static void main(String[] args) {
        
        Studentdetails obj1 = new Studentdetails();
        obj1.details(1, "Jash");

        Studentdetails obj2 = new Studentdetails();
        obj2.details("jash", 2);
    }
    
}

class Studentdetails{

    public void details(int rollno, String name){
        System.out.println("The roll no is: " + rollno + "\n the name is " + name);
    }

    public void details(String name, int rollno){
        System.out.println("The name is : " + name + "\n the rollno is : " + rollno);
    }
}
