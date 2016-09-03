package nyc.c4q.leighdouglas;

import java.util.Scanner;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem6 {
    public static void hungryHippos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a food:");
        String UserInput = scanner.nextLine();
        String Answer = null;
        char firstLetter = Character.toLowerCase(UserInput.charAt(0));
        if (firstLetter == 'h') {
            Answer = "Yum!";
        } else {
            Answer = "Yuck!";
        }
        System.out.println(Answer);
    }
}
