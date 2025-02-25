import java.util.Scanner;

class test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int st=n/2+1,sp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){

                System.out.print("*");
            }
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){

                System.out.print("*");
            }
            if(i<=n/2){
                sp+=2;
                st--;;
            }else{
                sp-=2;
                st++;
            }
            System.out.println();
        }
    }
    
}
