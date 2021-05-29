import java.util.Scanner;

public class UCLNVaUCNN {
    public static void main(String[] args) {
        int so1, so2, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("So nguyen duong thu 1: ");
        so1 = input.nextInt();
        System.out.print("So nguyen duong thu 2: ");
        so2 = input.nextInt();
        while (so1 != so2) {
            if (so1 > so2) {
                so1 -= so2;
            } else {
                so2 -= so1;
            }
        }
        System.out.println("Uoc chung nho nhat la: " + i);
        System.out.println("Uoc chung lon nhat la: " + so2);
    }
}
