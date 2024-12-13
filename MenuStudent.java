import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<Student>();
//        Student student1 = new Student("Thao", 12, "abc");
//        Student student2 = new Student("Quang", 14, "def");
//        Student student3 = new Student("Anh Nam", 18, "ert");
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
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
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Please Add Student!");
                break;
            case 2:
                System.out.println("Please Delete Student!");
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
                System.out.println("Exit Program");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    } while (choice != 5);


    }

    /**
     * Edit Student by Name
     *
     * @param oldName String
     * @param studentList List<Student>
     */
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


    }




