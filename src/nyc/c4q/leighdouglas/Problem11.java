package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem11 {

    public static void cutStringAtCharacter(String someText, char aChar){
        String leftoverString = null;

        for (int i = 0; i < someText.length(); i++){
            if (someText.charAt(i) == aChar){
                leftoverString = someText.substring((i+1), (someText.length()-1));
                break;
            }
        }
        System.out.println(leftoverString);
    }
}
