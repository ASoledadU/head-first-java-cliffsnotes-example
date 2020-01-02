import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess;
        do {
            System.out.print("Guess my name: ");
            guess = scanner.nextLine();
        } while (!"Angie Soledad".equals(guess));
        System.out.println("Congratulations, you guessed my name correctly!");
        scanner.close();
    }
}

// Will break if you guess another name that is not equal to Daffy Duck.