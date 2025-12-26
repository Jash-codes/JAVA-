
public class ForEachExample {

    public static void main(String[] args) {

        String[] playlist = { "stay", "pokerface", "magiclight", "shapeofyou" };

        System.out.println("USING FOR LOOP");

        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Now playing : " + playlist[i]);
        }

        System.out.println(" ");

        System.out.println("USING FOR-EACH LOOP");

        for (String song : playlist) {

            System.out.println("Now playing : " + song);

        }
    }

}
