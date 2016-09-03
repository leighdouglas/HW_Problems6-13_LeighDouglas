package nyc.c4q.leighdouglas;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem13 {


    public static double totalCostofIceCream(int toppings) {
        double base = 2.33;
        double costOfToppings = toppings * 0.33;
        double totalCost = base + costOfToppings;
        return totalCost;
    }

    public static void uberIceCream() {
        boolean repeatPrompt = false;
        int numOfToppings = 0;
        double iceCreamCost = 2.33;

        Random random = new Random();
        String deliveryTime = Integer.toString(random.nextInt(50));

// I found the above code on stack overflow for finding a random number. I understand how it works, as it is creating a new variable in the Random class and assigns it a new class constructor. Then I created a string variable that takes the value of a randomly generated integer found by using the nextInt() method on the random variable created in the line before it, and turns that value into a string. Hope this makes sense, still trying to learn the java lingo.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to Kwik Kustards, the Uber for Ice Cream! Before we start, may I please know your name?");
        String userName = scanner.nextLine();
        System.out.println("Thank you " + userName + ", let's get started. Which flavor of ice cream would you like? We literally have everything so don't worry, we probably have what you're looking for :)");
        String iceCreamFlavor = scanner.nextLine();
        System.out.println("Great! You chose " + iceCreamFlavor + ". Now, for the toppings. Please respond with yes or no. Would you like rainbow sprinkles?");
        String topping1 = scanner.nextLine();

        do {
            if (topping1.equalsIgnoreCase("yes") || topping1.equalsIgnoreCase("y")) {
                ++numOfToppings;
                repeatPrompt = false;
                break;
            } else if (topping1.equalsIgnoreCase("no") || topping1.equalsIgnoreCase("n")){
                repeatPrompt = false;
                break;
            } else {
                System.out.println("Please enter yes or no");
                topping1 = scanner.nextLine();
                repeatPrompt = true;
            }
        } while (repeatPrompt);

        System.out.println("Fantastic. would you like chocolate chips?");
        String topping2 = scanner.nextLine();

        do {
            if (topping2.equalsIgnoreCase("yes") || topping2.equalsIgnoreCase("y")) {
                ++numOfToppings;
                repeatPrompt = false;
                break;
            } else if (topping2.equalsIgnoreCase("no") || topping2.equalsIgnoreCase("n")){
                repeatPrompt = false;
                break;
            } else {
                System.out.println("Please enter yes or no");
                topping2 = scanner.nextLine();
                repeatPrompt = true;
            }
        } while (repeatPrompt);

        System.out.println("Alright. Finally, would you like cookie dough?");
        String topping3 = scanner.nextLine();

        do {
            if (topping3.equalsIgnoreCase("yes") || topping3.equalsIgnoreCase("y")) {
                ++numOfToppings;
                repeatPrompt = false;
            } else if (topping3.equalsIgnoreCase("no") || topping3.equalsIgnoreCase("n")){
                repeatPrompt = false;
                break;
            } else {
                System.out.println("Please enter yes or no");
                topping3 = scanner.nextLine();
                repeatPrompt = true;
            }
        } while (repeatPrompt);

        String finalCost = Double.toString(totalCostofIceCream(numOfToppings));
        System.out.println("Great, you have ordered " + iceCreamFlavor + " ice cream with " + Integer.toString(numOfToppings) + " toppings. Your total is $" + finalCost + ", and your ice cream will arrive in about " + deliveryTime + " minutes");

    }


    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
