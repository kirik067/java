package cw5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a = s.split(" ").length;
        int i;
        String[] b = new String[a];
        for (i = 0; i < a; i++) {
            for (String retval : s.split(" ")) {
                b[i] = retval;
                System.out.println(b[i]);
            }
        }
    }
}

