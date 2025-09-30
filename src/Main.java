import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 21) {
            System.out.println("You get a paper wrist band.");
        }

        input.close();
    }
}
