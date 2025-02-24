import java.util.*;
class printInverseOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int inverse=0;
        int p=0;
        while(num!=0){
            int dig=num%10; 
            p++;
            inverse=inverse + p*(int)Math.pow(10, dig-1);
            num/=10;
        }
        System.out.println(inverse);
    }
}
 