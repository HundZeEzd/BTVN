import java.util.Scanner;

public class StringSoLanLapLai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap xau ki tu: ");
        String a = input.next();
        int num = a.length();
        char[] arr = new char[a.length()];
        for (int i = 0; i < num; i++) {
            arr[i] = a.charAt(i);
        }
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println("So lan lap lai cua " + arr[i] + ": " + count);
        }
    }
}
