import java.util.Scanner;

/**
 * Created by User on 3/24/2017.
 */
public class AppleAndOrange {
    public static int amountFruitsLandedAtHome(int a, int m, int[] arr, int s, int t) {
        int fruits = 0;
        for(int i = 0; i < m; i += 1) {
            int tmp = a + arr[i];
            if(tmp >= s && tmp <= t){
                fruits += 1;
            }
        }
        return fruits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }

        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        System.out.println(amountFruitsLandedAtHome(a,m,apple,s,t));
        System.out.println(amountFruitsLandedAtHome(b,n,orange,s,t));
    }
}
