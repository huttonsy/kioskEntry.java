import java.util.*;
public class KioskEntry {
    public static void main(String[] args) {
        Scanner AgeInput = new Scanner(System.in);
        int UserAge = 0;
        while ((UserAge = AgeInput.nextInt()) <= 0) {
            System.out.print("Please enter your age:");
            if (UserAge >= 21);
            System.out.println("You get a wristband!");
        }

    }
}