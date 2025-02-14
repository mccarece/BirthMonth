import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = console.nextInt();

        if (birthMonth > 12 || birthMonth <= 0) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
        else {
            System.out.println("Your birth month is: " + birthMonth);
        }
    }
}