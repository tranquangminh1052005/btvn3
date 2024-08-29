
package btvn3;

import java.util.Scanner;

public class caculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong phan tu mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("sum: " + sum);
        System.out.println("agv: " + average);
    }
}
