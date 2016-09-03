package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem10 {

    public static void countVowels(String text){
        int numOfVowels = 0;
        for (int i = 0; i < text.length(); i++){
            switch(text.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ++numOfVowels;
                    break;
                default:
            }
        }
        System.out.println(numOfVowels);
    }
}
