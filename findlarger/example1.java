class example1 {

    static int findlarger(int x, int y, int z) {

        if (x > y && x > z) {
            return x;

        } else if (y > x && y > z) {
            return y;

        } else {
            return z;
        }

    }

    public static void main(String[] args) {
        int a, b, c, largest;

        a = 4;
        b = 7;
        c = 1;

        largest = findlarger(a, b, c);

        System.out.println("The largest number is " + largest);
    }
}
