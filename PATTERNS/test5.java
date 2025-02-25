import java.util.Scanner;

class test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int sp=n/2,st=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){

                System.out.print("*");
            }
            if(i<=n/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
    
}
