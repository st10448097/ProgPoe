 import java.util.Scanner;

    public class LoginSystem {
        private static String USERNAME = "myusername";
        private static String PASSWORD = "mypassword";
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean loggedIn = false;
    
            while (!loggedIn) {
                System.out.print("Enter username: ");
                String enteredUsername = scanner.nextLine();
    
                System.out.print("Enter password: ");
                String enteredPassword = scanner.nextLine();
    
                loggedIn = login(enteredUsername, enteredPassword);
    
                if (!loggedIn) {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }
            System.out.println("Login successful!");
        }
    
        public static boolean login(String username, String password) {
            return username.equals(USERNAME) && password.equals(PASSWORD);
        }
    
}
