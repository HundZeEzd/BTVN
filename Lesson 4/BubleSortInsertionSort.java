public class BubleSortInsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 7, 4, 8, 3, 9, 2, 6, 11, 15, 14, 20, 17};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int inse = arr[i];
                    arr[i] = arr[j];
                    arr[j] = inse;
                }
            }
        }
        System.out.print("Mang sau khi sap xep insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }
        System.out.println();
        arr = new int[]{2, 1, 5, 7, 4, 8, 3, 9, 2, 6, 11, 15, 14, 20, 17};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int bubl = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bubl;
                }
            }
        }
        System.out.println("");
        System.out.print("Mang sau khi sap xep buble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }
    }
}
