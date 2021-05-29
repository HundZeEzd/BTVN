import java.util.Scanner;

public class BaoNhieuSoChiaHetCho3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("So phan tu cua mang: ");
        int so = input.nextInt();
        int ketqua = 0;
        int[] arr = new int[so];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("So thu " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                ketqua++;
            }
        }
        System.out.println("So phan tu chia het cho 3: " + ketqua);
    }
}
