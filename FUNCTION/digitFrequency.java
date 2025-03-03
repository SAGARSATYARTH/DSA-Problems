// you are given a number n and a digit d then calculate the frequency of digit d in number n.
import java.util.*;
public class digitFrequency {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=scn.nextInt();
        System.out.print("Enter d : ");
        int d=scn.nextInt();
        System.out.println("The digit "+d+" in "+num+" are "+countDigit(num, d)+" time.");
    }
    public static int countDigit(int n,int d){
        int count=0;
        while(n!=0){
            int digit=n%10;
            n/=10;
            if(digit==d){
                count++;
            }
        }
        return count;
    }
}