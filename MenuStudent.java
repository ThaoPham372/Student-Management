import java.util.Scanner;

public class MenuStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
    do {
        System.out.println("-----Student Management Menu-----");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Edit Student");
        System.out.println("4. Search Student By Name");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please Add Student!");
                break;
            case 2:
                System.out.println("Please Delete Student!");
                break;
            case 3:
                System.out.println("Please Edit Student!");
                break;
            case 4:
                System.out.println("Please Search Student By Name!");
                break;
            case 5:
                System.out.println("Exit Program");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }while (choice != 5);


    }

}
