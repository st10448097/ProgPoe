import java.util.HashMap;
import java.util.Scanner;

public class RegistrationAndLogin {
    private static HashMap<String, User> user = new HashMap<>();

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registration and Login Feature");

        System.out.println("Enter username (max 5 characters with underscore):");
        System.out.println("--Register---");
        String username = scanner.nextLine();

        if (username.length() < 5 || !username.contains("_")) {
            System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return;
        }
        if (user.containsKey(username)) {
            System.out.println("Username already exists. Choose another one.");
            return;
        }

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (!isValidPassword(password)) {
            System.out.println("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return;
        }

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        user.put(username, new User(username, password, firstName, lastName));

        System.out.println("Registration successful!");
    }

   public void loginUser(Scanner scanner) {
        System.out.println("===Login===");
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        if (!user.containsKey(username)) {
            System.out.println("Username not found. Register.");
            return;
        }

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        User userObj = user.get(username);
        if (!userObj.getPassword().equals(password)) {
            System.out.println("Incorrect password.");
            return;
        }

        System.out.println("Login successful! Welcome, " + userObj.getFirstName() + " " + userObj.getLastName());
    }

    static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    static class User {
        private String username;
        private String password;
        private String firstName;
        private String lastName;

        public User(String username, String password, String firstName, String lastName) {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}


