public class Details {

    public static void main(String[] args) {
        
        Students new1 = new Students();
        new1.setdetails(1,"jash",19,"Male");

       new1.printdetails();

    }

}

class Students {

    int rollno;
    String name;
    int age;
    String gender;

    public void setdetails(int rollno, String name, int age, String gender) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getrollno() {
        return rollno;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public String getgender() {
        return gender;
    }

    void printdetails(){

        System.out.println("ROLL NO : " + rollno);
        System.out.println("NAME : " + name);
        System.out.println("AGE : " + age);
        System.out.println("GENDER : " + gender);

    }
}
