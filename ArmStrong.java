import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        

        System.out.println("enter the number");
        int num=scanner.nextInt();
        int temp=num;
        int arm=0;
        while(num !=0){
            int rem=num%10;
            
            arm +=Math.pow(rem,3);
            num=num/10;

        }
        if(arm==temp){
            System.out.println("number is arm");
        }
        else{
            System.out.println("not arm");
        }
        
        scanner.close();
    }

    
}
