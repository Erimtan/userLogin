import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, userPassword, changePassword, newPassword;

        System.out.print("Username: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        userPassword = input.nextLine();

        if (userName.equals("patika") && userPassword.equals("java")) {
            System.out.println("Welcome Patika!");
        } else if (!userPassword.equals("java")) {
            System.out.print("You entered wrong password!\nDo you want to change your password? Yes='Y' No='N': ");
            changePassword = input.nextLine();
            switch (changePassword) {
                case "Y":
                    System.out.print("Enter your new password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java")){
                        System.out.println("Your password cannot be the same as the old password!");
                    }else {
                        System.out.println("Your password has been changed!");
                    }
                    break;
                case "N":
                    break;
                default:
                    System.out.println("You typed wrong character!");
            }
        } else {
            System.out.println("Your username or password is wrong!");
        }
    }
}