package Number_gussing_game;
import java.util.Random;
import java.util.Scanner;

public class Number_guees {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Random random = new Random();
        int robot = random.nextInt(1, 11);
        int user = 0;
        System.out.println("****Number gussing game****");

        do {

            System.out.println("Enter your number 1-10 ");
            try {
                user = scanf.nextInt();

            } catch (Exception e) {
                System.out.println("Invalid input");
                scanf.close();
                continue;
            }

            if (user == robot) {
                System.out.println("congress\n you won the game");

            } else if (user > robot) {
                System.out.println("Your number is higher ");

            } else if (user < robot) {
                System.out.println("Your number is lower");

            }

        } while (user != robot);
        scanf.close();
    }
}