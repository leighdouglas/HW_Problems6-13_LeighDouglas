package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem12 {
    public static void christmasSong() {
        for (int i = 1; i <= 12; i++) {
            String dayNumber;
            if (i == 1) {
                dayNumber = Integer.toString(i) + "st";
            } else if (i == 2) {
                dayNumber = Integer.toString(i) + "nd";
            } else if (i == 3) {
                dayNumber = Integer.toString(i) + "rd";
            } else {
                dayNumber = Integer.toString(i) + "th";
            }

            String repeatingLyric = "On the " + dayNumber + " day of christmas my true love gave to me";
            System.out.println(repeatingLyric);


            switch (i) {
                case 1:
                    System.out.println("a Partridge in a pear tree");
                    continue;
            }

            switch (i) {
                case 12:
                    System.out.println("12 Bells ringing");
                case 11:
                    System.out.println("11 ladies dancing");
                case 10:
                    System.out.println("10 Pipers piping");
                case 9:
                    System.out.println("9 Drummers drumming");
                case 8:
                    System.out.println("8 Maids a milking");
                case 7:
                    System.out.println("7 Swans a swimming");
                case 6:
                    System.out.println("6 Geese a laying");
                case 5:
                    System.out.println("5 Gold rings");
                case 4:
                    System.out.println("4 Colly birds");
                case 3:
                    System.out.println("3 French hens");
                case 2:
                    System.out.println("2 Turtle doves");
                case 1:
                    System.out.println("and a Partridge in a pear tree");
            }
        }
    }
}
