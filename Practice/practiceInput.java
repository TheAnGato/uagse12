import java.util.Scanner;

public class practiceInput{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("What's your name? ");
        String s = in.nextLine();
        System.out.println("Sup, "+s);
    }
}