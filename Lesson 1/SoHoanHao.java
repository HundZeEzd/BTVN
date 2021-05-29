public class SoHoanHao {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 1000000000; i++) {
            a = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    a += j;
                }
            }
            if (a == i) {
                System.out.println(a);
            }
        }
    }
}