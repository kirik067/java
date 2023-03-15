package cw;
import java.util.Scanner;

public class Ex1
{
    public static void main (String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            int a = scanner.nextInt();
            int c = 0;
            while (a != 0)
            {
                a = scanner.nextInt();
                if(a > 0 )
                {
                    c = c + a;
                }
            }
            System.out.print(c);
        }
    }
}