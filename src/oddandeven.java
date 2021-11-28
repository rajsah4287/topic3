import java.util.Scanner;
public class oddandeven {
    public static void main(String[]args){
        int even=0;
        int odd=0;
       for(int i=2;i<21;i++) {
           if (i % 2 == 0) {
           even++;

       }else{
           odd++;
           }
       }
            System.out.println("No of even"+even+"odd np:+odd");
       }
    }
