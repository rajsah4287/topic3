import java.util.Scanner;
public class ReversNumber {
    public static void main(String[]args) {
        System.out.println("Enter a number");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int Reverse = 0;
        while (num > 0){
            int rem = num%10;
            Reverse = Reverse *10 +rem;
            num /=10;
            System.out.println("Reverse :" + Reverse);

        }

    }
}
