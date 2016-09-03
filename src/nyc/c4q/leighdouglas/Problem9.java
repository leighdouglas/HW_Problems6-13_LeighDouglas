package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem9 {
    public static void countCode(String text){
        int numberOfWordCode = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) != 'c'){
                continue;
            } else if (text.charAt(i) == 'c'){
                if(text.charAt(i+1) == 'o'){
                    if(text.charAt(i+3) == 'e'){
                        ++numberOfWordCode;
                    }
                }
            }
        }
        System.out.println(numberOfWordCode);
    }
}
