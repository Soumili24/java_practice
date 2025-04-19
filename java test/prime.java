import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int num1 = num;
        int reverse = 0;

        while(num>0){
            int n = num%10;
            reverse= reverse*10 + n;
            num=num/10;
        }
        System.out.println("reverse:"+reverse);

        if(reverse==num1){
            System.out.println("the num is palimdrone");
        }
        else{
            System.out.println("the num is not palimdrone");
        }
        sc.close();

    }
}