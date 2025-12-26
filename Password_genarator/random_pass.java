package Password_genarator;
import java.util.Random;

public class random_pass {
    public static void main(String[] args) {
        String charecters = "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "1234567890"
                + "!@#$%&?";

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        int password_lenght = 12;

        for (int i = 0; i < password_lenght; i++) {
            int random_index = random.nextInt(charecters.length());
            password.append(charecters.charAt(random_index));

        }
        System.out.println("Your random password is :" + password.toString());
    }
}
