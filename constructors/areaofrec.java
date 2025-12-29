public class areaofrec {

    int Length;
    int breadth;

    areaofrec(int length, int breadth) {

        this.Length = length;
        this.breadth = breadth;

    }

    void calculate_area() {
        int area_of_rec = Length * breadth;
        System.out.println("The area of the rectangle is : " + area_of_rec);
    }

    public static void main(String[] args) {
        
        areaofrec new1 = new areaofrec(4, 6);
        new1.calculate_area();
    }

}
