class Private{

    private Private(){

        System.out.println("constructor is private");
    }

    public static void displaymsg(){

        System.out.println("HII");

    }

    public static void main(String[] args) {
        
        Private.displaymsg();
    }
}