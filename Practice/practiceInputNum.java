import java.util.Scanner;

public class practiceInputNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            
            System.out.print("Enter a number (exit to quit): ");
            String s = in.nextLine();
            
            System.out.println("You entered "+s);
       
    }
}