import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Basamak sayısı :");
        int n = klavye.nextInt();
       
        for (int i = n; i >= 0 ; i--) {
              //puts 0 spaces in the first line then increments by one puts 10 spaces in the last line
                   for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }
           //puts 21 * in the first line then increments by one puts 1 * in the last line
           for (int k =(2 * i + 1) ; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}

