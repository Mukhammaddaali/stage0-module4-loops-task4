package school.mjc.stage0.loops.task4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i=1;i<=lastPrinted;i++){
            if (i%3==0) continue;else System.out.println(i);
        }

    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printUntilButThird(x);
    }
}
