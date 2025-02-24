import java.util.*;
class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=sc.nextInt();
        int count=0;
        for(int i =2;i*i<=num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("Not Prime");

        }else{
            System.out.println("Prime Number");
        }

    }
}
