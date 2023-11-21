import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int rand;
        //guess mum between 0 and 100
        rand = ((int) (Math.random() * 100));
        boolean stillplay = true;
        System.out.println("the generated random num is" + rand);
        while (stillplay) {
            System.out.println("get a num between 0 and 100");
            guess = scanner.nextInt();
            // to check if guess no is greater than random
            if (guess > rand)
                System.out.println("too large");
            else if (guess < rand) {
                System.out.println("too small");
            } else
                System.out.println("you win");
            stillplay = false;
        }
    }
}