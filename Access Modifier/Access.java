public class Access {

    public static void main(String[] args) {
        
        student new1 = new student();

        // System.out.println(new1.password);
        System.out.println(new1.name);
        System.out.println(new1.cgpa);
        System.out.println(new1.school_name);
    }
    
}

class student{

        public String school_name = "Global high";

        private int password = 12345678;

        protected float cgpa = 8.27F;

        String name = "Jash";

        void displayprivate(){

            System.out.println(password);
        }

    }
