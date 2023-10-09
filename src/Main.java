import java.util.Scanner;

public class Main {
        public static void main (String[] args) {
                System.out.println("Introdu un numar 1-10");
               
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();

            if(A == 1) {
                System.out.println("NUMAR IMPAR");
            }
            else if(A == 2) {
                System.out.println("NUMAR PAR");
            }

            else if(A == 3) {
                System.out.println("NUMAR IMPAR");
            }

            else if(A == 4) {
              System.out.println("NUMAR PAR");
            }

            else if(A == 5) {
                System.out.println("NUMAR IMPAR");
            }

            else if(A > 5 && A < 11) {
                System.out.println("Suma = "+(6+8+9+10));
            }

            else if(A == 0) {
                System.out.println("EXIT");
            }

            else if(A > 10) {
                System.out.println("EXIT");
            }



        }

}
