package recusrion;

import java.util.Scanner;

public class p1 {

    public  static  int Factorial(int number){

        if (number ==0 ){
            return 1;
        }
        return  number * Factorial(number-1);

    }

    public static void main(String[] args) {
        //  factorial of a number
        System.out.println("Find a Factorial of a Number ");
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        System.out.println(Factorial(number));

    }
}
