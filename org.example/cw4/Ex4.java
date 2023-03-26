package cw4;
import java.util.Scanner;

public class Ex4
{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; ++i) {
        a[i] = scanner.nextInt();
        }
        int tmp;
        for (int i = size - 1, j = 0; i >= size / 2; --i, ++j) {
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        }
        for (int i = 0; i < size; ++i) {
        System.out.print(a[i] + " ");
        }
    }
}
