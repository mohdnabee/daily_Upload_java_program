import java.util.Scanner;

public class Class2ReverseArray {
    public static void main(String[] args) {

        // reverse an array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arry size: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of an array: ");
        int [] arr = new int[n];



        // take user input elements through loops
        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        //  output or revarse of an array elements

        System.out.print("The reverse of the array is: ");
        for (int i =arr.length-1;i>=0; i--){
            System.out.print(arr[i]+ " ");
        }

    }
}
