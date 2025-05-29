package recusrion;

import java.util.Scanner;

public class factorial {

    public  static int FactotailN(int num ){

       // base case
        if (num == 0 || num == 1){
            return 1 ;
        }

  return num * FactotailN(num -1);


    }


    public static void main(String[] args) {


        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num  = sc.nextInt();

        System.out.println("Factorial of "+num + " is  : " +FactotailN(num));

    }
}
