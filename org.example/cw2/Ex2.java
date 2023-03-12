package cw2;
import java.util.Scanner;
public class Ex2 {
public static void main(String [] args) {
    try (Scanner scanner = new Scanner(System.in)){
        int a = scanner.nextInt();
        int c = 0;
    for(int i = 2; i <= a; i++){
        boolean isPrime = true;

        for(int j = 2; j < i; j++){
            if(i % j == 0){
                isPrime = false;
                break;
            }
            while (a != 0)
            {
                
                if(a + 1 == 0)
                {
                    c = c + a;
                }
                
                
                if(isPrime){
                    System.out.println(c);
                }

            }
        
        }
        
        
    }


}
}
}