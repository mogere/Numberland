import java.util.Scanner;

public class Main {

    static int counter(int number){ //function takes in individual odd/even number in the range
        int result = 0;

        for(int i=number; i>0; i--) { //loop through all the even or odd numbers less than the largest odd/even number
            result += (int) (Math.pow(2, i)) - 1; //formula of 2 raised to power number minus 1
        }
        return result;
    }

    static int pictures(int E, int O){
        O-=1;//reduce the value of O by 1 since 0 is not considered in the even numbers.
        return counter(E)+counter(O); // add values of the count of pictures of even and odd numbers.
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of E :");
        int E = sc.nextInt();
        System.out.println("Enter the value of O :");
        int O = sc.nextInt();
        System.out.println("Number of pictures taken is:"+pictures(E,O));
    }

}
