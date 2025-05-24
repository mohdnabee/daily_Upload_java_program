package recusrion;
 ///   sum of n natural numbers
public class p2 {

    public  static  int sum(int number){
        if (number == 0 ){
            return 0;
        }

        return number + sum(number-1);


    }

    public static void main(String[] args) {

        int number = 10;
        System.out.println(sum(number));

    }
}
