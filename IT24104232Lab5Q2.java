import java.util.Scanner;

public class IT24104232Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of new members you have introduced: ");
        int numMembers = scanner.nextInt();
        if (numMembers < 0) {
            System.out.println("Input must be a number 0 or greater.");
        } else {
            String prize;
            switch (numMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone"; 
                    break;
            }
            System.out.println("The prize is: " + prize);
        }
    }
}