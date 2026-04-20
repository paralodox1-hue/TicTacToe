import java.util.Scanner;

public class UC3 {

    // Method to read user slot input
    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1–9): ");
            if (sc.hasNextInt()) {
                slot = sc.nextInt();
                if (slot >= 1 && slot <= 9) {
                    return slot;
                } else {
                    System.out.println("Invalid slot! Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next();
            }
        }
    }


    public static void main(String[] args) {
        int userSlot = getUserSlot();
        System.out.println("You selected slot: " + userSlot);
        // control returns to game logic here
    }
}