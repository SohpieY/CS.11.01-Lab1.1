import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner theAge = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = theAge.nextInt();    // 20
        int bookPage = 100 - age;
        System.out.println(age + " year olds should read at least " + bookPage + " pages before giving up on a book.");
        String quote = " Thanks to Jim Cohoon at The University of Virginia";
        System.out.println("\nCredit:" + quote);
    }
}
