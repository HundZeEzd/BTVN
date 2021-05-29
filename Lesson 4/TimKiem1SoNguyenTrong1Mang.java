import java.util.Scanner;

public class TimKiem1SoNguyenTrong1Mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("So nguyen can tim kiem: ");
        int so = input.nextInt();
        int[] num = {1, 2, 3, 4, 5};
        boolean found = false;
        for (int n : num) {
            if (n == so) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(so);
        else
            System.out.println(-1);
    }
}
