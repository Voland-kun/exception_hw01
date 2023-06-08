package hw_01;

public class hw_01b {
    public static void main(String[] args) {
        int arr1[] = new int[]{9,8,7,6,5};
        int arr2[] = new int[]{1,2,3,0,4};
        int arr3[] = diff(arr1, arr2);
        for(int i : arr3)
            System.out.println(i);
    }

    public static int [] diff (int [] a, int [] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Массивы разного размера");
            }
        int d[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            d[i] = a[i] / b[i];
        }
        return d;
    }
}
