package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil<toBreakWith) System.out.println("iterating till the end");
        for (int i=1;i<numberToGoUntil;i++)
        {
            if (i==toBreakWith)break;
            System.out.println(i);
        }

    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printNumbersUntilWithBreakOn(x,y);
    }
}
