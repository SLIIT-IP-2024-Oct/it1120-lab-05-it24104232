import java.util.Scanner;
public class IT24104232Lab5Q3 {
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_10 = 10;
    public static final int DISCOUNT_20 = 20;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; 
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
            return; 
        }
        int numberOfDays = endDate - startDate;
        if (numberOfDays < 1) {
            System.out.println("Error: Invalid reservation duration.");
            return;
        }
        double discount = 0;
        if (numberOfDays >= 5) {
            discount = DISCOUNT_20; 
        } else if (numberOfDays >= 3) {
            discount = DISCOUNT_10;
            }
        double totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
        if (discount > 0) {
            totalCost -= (totalCost * discount / 100);
        }
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid: Rs " + totalCost);
    }
}
