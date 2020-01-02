import java.util.*;

public class DecadesOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ask;
        System.out.println("How old are you?: ");
        ask = scanner.nextInt();
        int decades = (ask / 10);
        if (ask > 20) {
            System.out.println("Congratulations, you are " + decades + " decades old");
        } else if (ask > 9) {
            System.out.println("Congratulations, you are " + decades + " decade old");
        } else if (ask <= 0) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("You are not even a decade old!");
        }
        scanner.close();
    }
}