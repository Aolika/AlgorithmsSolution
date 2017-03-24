import java.util.Scanner;

/**
 * Created by User on 3/24/2017.
 */
public class GradingStudents {
    public static int[] getFinalGrade(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] >= 38) {
                if (arr[i] % 5 == 3) {
                    arr[i] = ((arr[i] / 5) + 1) * 5;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = in.nextInt();
        }

        getFinalGrade(arr);

        for(int i = 0; i < arr.length; i += 1) {
            System.out.println(arr[i]);
        }
    }
}
