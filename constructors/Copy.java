
class Copy {

    int id;
    String name;

    Copy(int id, String name) {

        this.id = id;
        this.name = name;
    }

    Copy(Copy obj2) {

        this.id = obj2.id;
        this.name = obj2.name;
    }



    public static void main(String[] args) {
        System.out.println("First object");
        Copy new1 = new Copy(01,"jash");
        System.out.println("ID is : " + new1.id + " name is " + new1.name);

        System.out.println("Second object");
        Copy new2 = new Copy(new1);
        System.out.println("ID is : " + new2.id + " name is " + new2.name);

    }
}

