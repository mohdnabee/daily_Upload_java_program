import java.util.Scanner;

public class Class1MinMaxArray {
    public static void main(String[] args) {

        // Q1.  find the maximum and minimum elements array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arry size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an array: ");

        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){}
        }

        System.out.println("The maximum element of the array is: " + max);
        System.out.println("The minimum element of the array is: " + min);
    }
}
