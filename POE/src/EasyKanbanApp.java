import java.util.Scanner;

public class EasyKanbanApp {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
 System.out.println("Login successful!");


    System.out.println("Enter your choice:\n1.add task \n2.show report \n3.Quit");
    int choice = scanner.nextInt();
        scanner.nextLine();
    switch (choice) {
        case 1:
            System.out.println("Adding tasks...");
Task.addTsk();            break;
        case 2:
            System.out.println("Showing report (coming soon)...");
            Report.showReport();
            break;
        case 3:
            System.out.println("Quitting the program...");
            System.exit(0);
            break;
        default:
            System.out.println("Invalid choice. Please select a valid option.");
    }


    }}


