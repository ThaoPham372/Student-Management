import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;


        do {
            System.out.println("-----Student Management Menu-----");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Search Student By Name");
            System.out.println("5. Show List Student");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Please Add Student!");
                    addStudent(studentList);
                    break;
                case 2:
                    System.out.println("Please Delete Student!");
                    deleteStudent(studentList);
                    break;
                case 3:
                    System.out.println("Please Edit Student!");
                    System.out.print("Enter Student Name to Edit: ");
                    String oldName = sc.nextLine();
                    editStudent(oldName, studentList);
                    break;
                case 4:
                    System.out.println("Please Search Student By Name!");
                    searchStudentByName(studentList);
                    break;
                case 5:
                    System.out.println("Show List Student!");
                    showList(studentList);
                    break;
                case 6:
                    System.out.println("Exit Program");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 6);
    }

    public static void editStudent (String oldName, List <Student> studentList) {
        Scanner sc = new Scanner(System.in);
        boolean isFound = false;
        for (Student student : studentList) {
            if (student.getName().equals(oldName)) {
                isFound = true;

                System.out.println("Enter Student New Name: ");
                String newName = sc.nextLine();
                student.setName(newName);

                System.out.println("Edit Student Name Successfully : " + newName);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Student Not Found");
        }
    }

    /**
     * Ham nhap ten hoc sinh
     *
     * @param studentList List<Student>
     */
    public static void addStudent(List<Student> studentList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name");
        String name = sc.nextLine();

        System.out.println("Enter student address");
        String address = sc.nextLine();

        System.out.println("Enter student age");
        int age = sc.nextInt();
        sc.nextLine();

        Student student = new Student(name, age, address);
        studentList.add(student);
    }

    /**
     * Ham xoa ten hoc sinh bang chu
     *
     * @param studentList List<Student>
     */
    public static void deleteStudent(List<Student> studentList) {
        Scanner sc = new Scanner(System.in);

        for (Student num : studentList) {
            System.out.println(num);
        }
        System.out.println("Enter student name you want to delete");
        String name = sc.nextLine();
        boolean isDeleteStudent = false;

        for (Student num : studentList) {
            if (num.getName().equals(name)) {
                isDeleteStudent = true;
                studentList.remove(num);
                System.out.println("Deleted successfully student " + name);
                break;
            }
        }
        if (!isDeleteStudent) {
            System.out.println("No exit " + name + " on the list ");
        }
    }
    /**
     * Search Student by Name
     *
     * @param studentList List<Student>
     */
    public static void searchStudentByName(List<Student> studentList){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name to Search: ");
        String name = sc.nextLine();

        boolean isFound = false;
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                System.out.println("Student Found");
                System.out.println(student);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Student Not Found");
        }
    }
    public static void showList (List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
