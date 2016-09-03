package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class Problem8 {
    public static void hashTriangle(int number) {
        StringBuilder hashTriangle = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            hashTriangle.append("#");
            System.out.println(hashTriangle);
        }
    }
}
