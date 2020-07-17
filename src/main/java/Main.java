import java.util.Scanner;

public class Main {

    static int counter(int number){ //function takes in individual odd/even number in the range
        int count = number-1; //number of odd or even numbers in the range
        int result = 0;

        for(int i=count; i>1; i-=2) {
            result += (int) (Math.pow(2, count)) - 1;
        }
        return result;
    }

    static int pictures(int E, int O){
        int largestEven = E*2;
        int largestOdd = (O*2)-1;
        return counter(largestEven)+counter(largestOdd);
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
