import java.util.*;
class leftRightRotationByK_Place {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        System.out.print("Enter k : ");
        int k=sc.nextInt();
        int nOdigit=0;
        int numtemp=num;
        while(numtemp!=0){
            numtemp/=10;
            nOdigit++;
        }
        k=k%nOdigit;
        if(k<0){
            k=k+nOdigit;
        }
        int divisior=1;
        int multiplier=1;

        for(int i=1;i<=nOdigit;i++){
            if(i<=k){
                divisior=divisior*10;
            }
            else{
                multiplier=multiplier*10;
            }
        }
        int quotient=num/divisior;
        int reminder=num%divisior;

        int rotateNumber=multiplier*reminder+quotient;
        System.out.println(("Rotated Number : "+ rotateNumber));
        
    }
    
}
