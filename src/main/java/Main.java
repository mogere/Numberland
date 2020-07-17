import java.util.Scanner;

public class Main {

    static int counter(int number){ //function takes in individual odd/even number in the range
        int count = number-1; //number of odd or even numbers in the range
        int result = 0;

        for(int i=count; i>0; i--) {
            result += (int) (Math.pow(2, count)) - 1;
        }
        return result;
    }

    static int pictures(int E, int O){
        return counter(E)+counter(O);
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
