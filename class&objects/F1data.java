public class F1data {

    String driver_name;
    String driver_team;
    int driver_points;

    public F1data(String driver_name, String driver_team, int driver_points) {

        this.driver_name = driver_name;
        this.driver_team = driver_team;
        this.driver_points = driver_points;

    }

    public void display() {
        System.out.println("\n Driver_name : " + driver_name + "\n Driver Team: " + driver_team + "\n Driver Points: "
                + driver_points);
    }

    public static void main(String[] args) {

        F1data driver1 = new F1data("Max Verstappen", "Oracle RedBull Racing", 310);
        driver1.display();
    }

}
