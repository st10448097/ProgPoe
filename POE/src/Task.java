import java.util.Scanner;

public class Task extends RegistrationAndLogin {

    public static void addTsk(){
        Scanner scanner=new Scanner(System.in);
                //Get number of tasks to print
        System.out.print("Enter number of tasks to add:");
        int NumTasks = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<NumTasks;i++){

            System.out.println("PLease enter your task name");
            String TaskName = scanner.nextLine(); 


            System.out.println("Please enter the descriptin of your task");
            String descriptionName;
            do{
                 descriptionName = scanner.nextLine();
            }
            while(!checkTaskDescription(descriptionName));
            System.out.println("Task successfully captured");

            String devName= scanner.nextLine();
            System.out.println(devName);

            System.out.println("Duration of tasks in hours");
            int Duration = scanner.nextInt();
            scanner.nextLine();

            
        
            
            System.out.print("Enter your choice:\n1.to do \n2.done\n3.doing");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                System.out.println("Adding tasks...");
                // Add your logic for adding tasks here
                break;
                case 2:
                System.out.println("Showing report (coming soon)...");
                // Add your logic for showing the report here
                break;
                case 3:
                System.out.println("Quitting the program...");
                // Add any cleanup or exit logic here
                break;
                default:
                System.out.println("Invalid choice. Please select a valid option.");
                
            }
            
            
        }}

    // taskID
    public static String createTaskId(String TaskName, int NumTasks) {
        String firstTwoLetters;
        String lastThreeLetters;
        if (TaskName.length() >= 2) {
            firstTwoLetters = TaskName.substring(0, 2);
        } else {
            firstTwoLetters = TaskName;
        }
        if (TaskName.length() > 3) {
            lastThreeLetters = TaskName.substring(TaskName.length() - 3);
        } else {
            lastThreeLetters = TaskName;
        }
        String taskID = firstTwoLetters + ":" + NumTasks + ":" + lastThreeLetters;
        return taskID;

    }

    // taskDescription
    private static boolean checkTaskDescription(String taskDescription) {
        if (taskDescription.length() < 50) {
            return true;
        } else {
            System.out.println("Please enter a task description less than 50 characters");
            return false;
        }
    }



}


