import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner newAge = new Scanner(System.in) ;
        System.out.println("Enter your age");
        int myAge;
        myAge = newAge.nextInt();
        int secondAge = (7 + (myAge)/2);
        System.out.println(myAge + " year olds should date somebody who is at least " + secondAge + " years old");
        String quote  = " Thanks to Jim Cohoon at The University of Virginia";
        System.out.println("\nCredit:" + quote);
    }
}
