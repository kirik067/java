package cw2;

import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] m = new int[n];
    for (int i = 0; i < n; i++) {
m[i] = scanner.nextInt();
}
int a = 0;
    for (int i = 1; i < n; i++) {
        if (m[i] < m[i + 1]) {
            a = a + 1;
    }   
}
if (n == a + 1) {
System.out.println("yes");
} else {
System.out.println("no");
}        
}
}