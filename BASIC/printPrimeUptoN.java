import java.util.*;
class printPrimeUptoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter low : ");
        int low=sc.nextInt();
        System.out.print("Enter high : ");
        int high=sc.nextInt();

        for(int i=low;i<=high;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}