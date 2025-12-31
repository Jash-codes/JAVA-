public class Example1 {

    public static void main(String[] args) {
        
        Student new1 = new Student(101, "Jash");
        new1.display();

        Student new2 = new Student(102, "Jai");
        new2.display();
    }

    
}

class Student{
    int rollno;
    String name;

    static String college = "MGR";

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
        
    }

    void display(){
        System.out.println(" The roll no is : " + rollno + "\n The name is " + name + "\n college is : " + college );
    }
}

