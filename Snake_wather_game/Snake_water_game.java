package Snake_wather_game;
import java.util.Random;
import java.util.Scanner;

public class Snake_water_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanf = new Scanner(System.in);
        System.out.println("--------------Snake wather Game-----------");
        int robot = random.nextInt(1, 4);
        int user = 0;

        try {
            System.out.println("Enter your name 1-3");
            user = scanf.nextInt();
            // snake water gun
            if (robot == 1 && user == 2) {
                System.out.println("user won the game!\n");
            } else if (robot == 3 && user == 2) {
                System.out.println("User Won the game!");

            } else if (robot == 3 && user == 1) {

                System.out.println("User Won the game !");
            } else if (robot == 2 && user == 1) {
                System.out.println("Robot Won the game!");

            } else if (robot == 2 && user == 3) {
                System.out.println("Robot Won the game!");

            }

            else if (robot == 1 && user == 3) {

                System.out.println("Robot Won the game !");
            } else if (robot == 1 && user == 1) {

                System.out.println(" Game  Draw!");
            }

            else if (robot == 2 && user == 2) {
                System.out.println(" Game Draw!");

            } else if (robot == 3 && user == 3) {

                System.out.println(" Game Draw !");
            } else {
                System.out.println("Somthik is wrong!");
            }

        } catch (Exception e) {
            System.out.println("Invalid input\n");

            scanf.close();
            user = 0;

        }
    }
}
