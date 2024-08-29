
package btvn3;

import java.util.Scanner;


public class maxmin {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so phan tu:");
        int n = scanner.nextInt();
        if (n<=0) {
            System.out.println("so luong phan tu phai lon hon 0.");
            return;
        }
        int[]array=new int[n];
        System.out.println("Nhap"+ n +"so nguyen");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        int max= array[0];
        int min= array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max){
            max = array[i];
        }
            if (array[i] < min){
            min = array[i];
        }
    }
        System.out.println("gia tri lon nhat trong mang:"+ max);
        System.out.println("gia tri nho nhat trong mang:"+ min);   
}
}
