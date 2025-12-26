package clock;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) {
        Boolean is_running = true;

        while (is_running) {
            LocalTime time = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String currentime = time.format(formatter);
            System.out.print("\r Your time is :" + currentime);
            System.out.flush();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\n clcok stoped");
                is_running = false;
            }

        }

    }
}