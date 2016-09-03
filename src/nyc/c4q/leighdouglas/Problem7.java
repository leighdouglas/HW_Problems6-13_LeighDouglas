package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem7 {
    public static void elide(String aString){
        String newString = null;

        if (aString.length() <= 6){
            System.out.println(aString);
        } else if(aString.length() > 6){
            System.out.println(aString.substring(0, 3) + "...");
        }
    }
}
