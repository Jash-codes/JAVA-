public class new4 {

    public static void main(String[] args) {

        Student obj1 = new Student(111, "braovk", 11);
        obj1.display();
        
    }

    static class Student {

        int roll_no;
        String name;
        int age;

        Student(int roll_no, String name, int age){
            this.roll_no = roll_no;
            this.name = name;
            this.age = age;
        }

        void display(){
            System.out.println(" Roll - no : " + roll_no);
            System.out.println(" Name : " + name);
            System.out.println(" Age : " + age); 
            System.out.println("-----------------"); 
        }

    }
    
}
