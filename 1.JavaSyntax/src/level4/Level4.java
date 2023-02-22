package level4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Level4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int smallestNum=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int num=0;

        while(true){
            System.out.println("Enter anumver");
            try{
                num=sc.nextInt();

            }catch (InputMismatchException e){
                System.out.println(e);
                break;
            }
            if(num< smallestNum){
                secondSmallest=smallestNum;
                smallestNum =num;
                continue;
            }
        }
        System.out.println("The smallest number:"+smallestNum);
    }
}
