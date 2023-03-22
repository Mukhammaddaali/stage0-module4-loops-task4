package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        if (lastInRow < 0) System.out.println("last number in row is negative");
        else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else
            for (int i = 1; i < lastInRow; i++) {

                if (i == numberToSkip) continue;
                sum += i;
            }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printSumOfTwoRanges(x,y);
    }
}
