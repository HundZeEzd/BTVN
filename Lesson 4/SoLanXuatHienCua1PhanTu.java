import java.util.Scanner;

public class SoLanXuatHienCua1PhanTu {
    public static void main(String[] args) {
        int n, x, count = 0, i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("So phan tu cua mang: ");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("Phan tu can tim so lan xuat hien: ");
        x = input.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua phan tu: " + count);
    }
}
