import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap xau ki tu: ");
        String xau;
        char kitu;
        xau = input.nextLine();
        for (int i = 0; i < xau.length(); i++) {
            kitu = xau.charAt(xau.length() - i - 1);
            if (xau.charAt(i) == kitu) {
                System.out.println("Xau nay la chuoi Panlyndrome");
                break;
            } else {
                System.out.println("Xau nay khong la chuoi Panlyndrome");
                break;
            }
        }
    }
}
